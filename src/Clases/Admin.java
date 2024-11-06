
package Clases;

import EDD.Lista;
import EDD.NodoPersonaje;
import EDD.Queue;
import UI.UI_Controlador;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class Admin extends Thread {
    
    private AI ai;
    
    private TV_Show colasStarWars; // TV_Show contiene 4 colas
    private TV_Show colasStarTrek; // TV_Show contiene 4 colas
    
      private final Semaphore semaforo;
    private int Round = 1;



    public Admin(AI ai, Semaphore semaforo, Lista OroStarWars, Lista PlataStarWars, Lista BronceStarWars, 
                             Lista OroStarTrek, Lista PlataStarTrek, Lista BronceStarTrek) {
        
        this.ai = ai;
        this.semaforo = semaforo;
        this.colasStarWars = new TV_Show( OroStarWars, PlataStarWars, BronceStarWars);
        this.colasStarTrek = new TV_Show( OroStarTrek, PlataStarTrek, BronceStarTrek); 
    }
    
    
    public void arrancarSimulacion(){
        
        //Aqui se define el nivel del personaje, se generan los atributos aleatoriamente, se decide de cual lista sacar al peleador
        // y luego se agrega a la cola de su nivel respectivo [ prioridad 1, 2 ó 3]
        for (int i = 0; i < 20; i++) {
            this.colasStarWars.defininirNivelPersonaje();
            this.colasStarTrek.defininirNivelPersonaje();
        }
        

        
                NodoPersonaje pointer2 = this.colasStarTrek.getPrioridad_1().getHead();
        while (pointer2 != null) {
            System.out.println("[ " + pointer2.getElement().getHP() + " ]");
            pointer2 = pointer2.getNext();
        }
        
   
  
        UI_Controlador.getGolpe().iniciarColasUI_StarWars(this.colasStarWars.getPrioridad_1(), 
                                                                                                       this.colasStarWars.getPrioridad_2() , 
                                                                                                       this.colasStarWars.getPrioridad_3());
        
        UI_Controlador.getGolpe().iniciarColasUI_StarTrek(this.colasStarTrek.getPrioridad_1(),
                                                                                                       this.colasStarTrek.getPrioridad_2() , 
                                                                                                       this.colasStarTrek.getPrioridad_3());
        
        UI_Controlador.getGolpe().getRound().setText("Round: "+ this.ai.getTurno());
        
        this.ai.clearFightersUI();
        UI_Controlador.getGolpe().setVisible(true);
        
        
                try {
            this.semaforo.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        this.start();
        this.getAi().start();
    }
    
    @Override
    public void run(){
        try{
        while(true){
            
            int duracionBatalla = UI_Controlador.getGolpe().getTiempo_Slider().getValue();
            this.ai.setTiempo(duracionBatalla);
  
            //Se chequea los refuerzos, para intentar subir alguno a prioridad_1 (Chance = 80%)
            actualizarRefuerzo(this.colasStarWars, this.colasStarTrek);
            
            actualizarUI();
            System.out.println("Primero"+this.Round );
            //Cada 2 Rounds, el admin agrega un nuevo personaje a cada TV_Show, si y solo, la funcion retorna true
            if(this.Round == 2){
                System.out.println("nuevo personaje");
                probabilidadCrearNuevoPersonaje();
                this.Round = 0;
            }
            
            //Se escoge al peleador y se guarda en una variable temporal
            Personaje personajeSW =escogerPeleador(this.colasStarWars);
            Personaje personajeST = escogerPeleador(this.colasStarTrek);
            
            prepararPersonajesUI(personajeSW, personajeST);
            
            //Se le pasa los peleadores a la AI
            this.getAi().setStarWars(personajeSW);
            this.getAi().setStarTrek(personajeST);
            
            //Actualizar colas en el UI
            actualizarUI();

            
            this.semaforo.release();
            Thread.sleep(100);
            this.semaforo.acquire();
            
            this.Round += 1;
               System.out.println(this.Round + "final");
            //Se aumenta los contadores para evitar la inanicion
            aumentarContadorPersonajes(this.colasStarWars);
            aumentarContadorPersonajes(this.colasStarTrek);
            
            //Actualizar colas en el UI
             actualizarUI();
             
        }
        }catch (InterruptedException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public Personaje escogerPeleador(TV_Show programa){
        if(programa.getPrioridad_1().isEmpty()){
            if(programa.getPrioridad_2().isEmpty()){
                if(programa.getPrioridad_3().isEmpty()){
                    System.out.println("hola escoger peleador");
                }else{
                    return programa.getPrioridad_3().dequeue().getElement();
                }
            }else{
                return programa.getPrioridad_2().dequeue().getElement();
            }
        }else{
            return programa.getPrioridad_1().dequeue().getElement();
        }
        
        return null;
    }
    
    
    //Aqui llamamos a las funciones que actualizan las colas de ambos programas
       public void aumentarContadorPersonajes(TV_Show programa){
           actualizarColas(programa.getPrioridad_1(), programa.getPrioridad_2());
           actualizarColas(programa.getPrioridad_2(), programa.getPrioridad_3());
    }
    
    
    //Aqui aplicamos la logica para actualizar el contador cada personaje en las colas
    public void actualizarColas(Queue prioridad_siguiente, Queue prioridad_actual){
        if(prioridad_actual.getHead() != null){

        //NodoPersonaje pointer = prioridad_actual.getHead();

        
          for (int i = 0; i < prioridad_actual.getLength(); i++) {
            NodoPersonaje personaje = prioridad_actual.dequeue();
            personaje.getElement().aumentarContador();
            
            if(personaje.getElement().getContador() >= 8){
                personaje.getElement().setContador(0);
                //pointer.getElement().setPrioridad(  pointer.getElement().getPrioridad() - 1    );
                //NodoPersonaje personaje = prioridad_actual.dequeue();
                prioridad_siguiente.enqueue(personaje.getElement());

            }
            else{
                prioridad_actual.enqueue(personaje.getElement()); 
            }
        }
        }
        else{
            System.out.println("cola vacia");
        }
    }
  
    //Aqui se aplica la logica para actualizar la cola del refuerzo
    public void actualizarRefuerzo(TV_Show programa, TV_Show programa2){
        if( programa.getRefuerzo().isEmpty() ){
            System.out.println("El refuerzo esta vacio, no se actualizara");
        }
        else{
            if(probabilidadSalirRefuerzo()){
                NodoPersonaje personaje  = programa.getRefuerzo().dequeue();
                NodoPersonaje personaje2 = programa2.getRefuerzo().dequeue();
                
                System.out.println("saliste del refuerzo");
                programa.getPrioridad_1().enqueue(personaje.getElement());
                programa2.getPrioridad_1().enqueue(personaje2.getElement());
            }
            else{
                NodoPersonaje personaje  = programa.getRefuerzo().dequeue();
                NodoPersonaje personaje2  = programa2.getRefuerzo().dequeue();
                programa.getRefuerzo().enqueue(personaje.getElement());
                programa2.getRefuerzo().enqueue(personaje2.getElement());
                System.out.println("No hay chance de que salga. Ve de ultimo a la cola");
            }
        }
        
    }
    
        
    //Hay un 80% chance de crear un personaje nuevo, en esta funcion se calcula ese chance
    private void probabilidadCrearNuevoPersonaje(){
        double chance = Math.random();
        if(chance <= 0.8){
            System.out.println("creado!");
            this.colasStarWars.defininirNivelPersonaje();
            this.colasStarTrek.defininirNivelPersonaje();
        }
        else{
            System.out.println("prob"+chance);
        }
    }
    
    //Hay un 40% chance de que los personajes en la cola del refuerzo salgan de esta cola, y vayan a la cola de prioridad 1
    private boolean probabilidadSalirRefuerzo(){
        double chance = Math.random();
        return chance <= 0.4;
    }
    
    
    public void actualizarUI(){
        
        UI_Controlador.getGolpe().actualizarColasUI_StarWars(this.colasStarWars.getPrioridad_1(), 
                                                                                                                this.colasStarWars.getPrioridad_2() , 
                                                                                                                this.colasStarWars.getPrioridad_3(),
                                                                                                                this.colasStarWars.getRefuerzo());
        
        UI_Controlador.getGolpe().actualizarColasUI_StarTrek(this.colasStarTrek.getPrioridad_1(), 
                                                                                                                this.colasStarTrek.getPrioridad_2() , 
                                                                                                                this.colasStarTrek.getPrioridad_3(),
                                                                                                                this.colasStarTrek.getRefuerzo());
    }
    
    
    public void prepararPersonajesUI(Personaje personajeSW, Personaje personajeST){
            UI_Controlador.getGolpe().agregarFotoUI(UI_Controlador.getGolpe().getSW_Peleador(), personajeSW.getFoto());
            UI_Controlador.getGolpe().getSW_ID().setText(personajeSW.getNombrePersonaje());
            UI_Controlador.getGolpe().getSW_HP().setText("HP: "+String.valueOf(personajeSW.getHP()));
            UI_Controlador.getGolpe().getSW_Habilidad().setText("Habilidad: "+personajeSW.getHabilidad());
            
            
            UI_Controlador.getGolpe().agregarFotoUI(UI_Controlador.getGolpe().getST_Peleador(), personajeST.getFoto());
            UI_Controlador.getGolpe().getST_ID().setText(personajeST.getNombrePersonaje());
            UI_Controlador.getGolpe().getST_HP().setText("HP: "+String.valueOf(personajeST.getHP()));
            UI_Controlador.getGolpe().getST_Habilidad().setText("Habilidad: "+personajeST.getHabilidad());
    }

    
    
    
 
        public AI getAi() {
        return ai;
    }

    public void setAi(AI ai) {
        this.ai = ai;
    }

    public TV_Show getColasStarWars() {
        return colasStarWars;
    }

    public void setColasStarWars(TV_Show colasStarWars) {
        this.colasStarWars = colasStarWars;
    }

    public TV_Show getColasStarTrek() {
        return colasStarTrek;
    }

    public void setColasStarTrek(TV_Show colasStarTrek) {
        this.colasStarTrek = colasStarTrek;
    }
    
    
    
    
}
