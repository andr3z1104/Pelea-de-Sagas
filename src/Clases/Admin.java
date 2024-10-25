
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
    
      private Semaphore semaforo;



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
        
        NodoPersonaje pointer = this.colasStarWars.getPrioridad_2().getHead();
        while (pointer != null) {
            System.out.println("[ " + pointer.getElement().getHP() + " ]");
            pointer = pointer.getNext();
        } 
        
//                NodoPersonaje pointer2 = this.colasStarTrek.getPrioridad_1().getHead();
//        while (pointer2 != null) {
//            System.out.println("[ " + pointer2.getElement().getHP() + " ]");
//            pointer2 = pointer2.getNext();
//        }
        
   
  
        UI_Controlador.getGolpe().iniciarColasUI_StarWars(this.colasStarWars.getPrioridad_1(), 
                                                                                                       this.colasStarWars.getPrioridad_2() , 
                                                                                                       this.colasStarWars.getPrioridad_3());
        
        UI_Controlador.getGolpe().iniciarColasUI_StarTrek(this.colasStarTrek.getPrioridad_1(),
                                                                                                       this.colasStarTrek.getPrioridad_2() , 
                                                                                                       this.colasStarTrek.getPrioridad_3());
        
        UI_Controlador.getGolpe().getRound().setText("Round: "+ this.ai.getTurno());
        
        //this.ai.clearFightersUI();
        UI_Controlador.getGolpe().setVisible(true);
        
        this.start();
    }
    
    @Override
    public void run(){
        try{
        while(true){
            
            this.semaforo.acquire();
            Thread.sleep(100);
            //Se chequea los refuerzos, para intentar subir alguno a prioridad_1 (Chance = 80%)
            actualizarRefuerzo(this.colasStarWars);
            actualizarRefuerzo(this.colasStarTrek); 
            
            Thread.sleep(100);
            //Cada 2 Rounds, el admin agrega un nuevo personaje a cada TV_Show, si y solo, la funcion retorna true
            if(this.getAi().getTurno() % 2 == 0){
                
            if(probabilidadCrearNuevoPersonaje()){
                this.colasStarWars.defininirNivelPersonaje();
                this.colasStarTrek.defininirNivelPersonaje();
            }
            
            }
            
            Thread.sleep(100);
            //Se escoge al peleador y se guarda en una variable temporal
            Personaje personajeSW =escogerPeleador(this.colasStarWars);
            Personaje personajeST = escogerPeleador(this.colasStarTrek);
            
            
            UI_Controlador.getGolpe().getSW_Peleador().setText(personajeSW.getNombrePersonaje());
            UI_Controlador.getGolpe().getST_Peleador().setText(personajeST.getNombrePersonaje());
            
            Thread.sleep(100);
            
            //Se le pasa los peleadores a la AI
            this.getAi().setStarWars(personajeSW);
            this.getAi().setStarTrek(personajeST);

            Thread.sleep(100);
            
            //Se aumenta los contadores para evitar la inanicion
            aumentarContadorPersonajes(this.colasStarWars);
            aumentarContadorPersonajes(this.colasStarTrek);
            
            
            //Actualizar colas en el UI
            UI_Controlador.getGolpe().actualizarColasUI_StarWars(this.colasStarWars.getPrioridad_1(), 
                                                                                                                this.colasStarWars.getPrioridad_2() , 
                                                                                                                this.colasStarWars.getPrioridad_3(),
                                                                                                                this.colasStarWars.getRefuerzo());
        
            UI_Controlador.getGolpe().actualizarColasUI_StarTrek(this.colasStarTrek.getPrioridad_1(), 
                                                                                                                this.colasStarTrek.getPrioridad_2() , 
                                                                                                                this.colasStarTrek.getPrioridad_3(),
                                                                                                                this.colasStarTrek.getRefuerzo());
            
            
            this.semaforo.release();
        }
        }catch (InterruptedException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public Personaje escogerPeleador(TV_Show programa){
        if(programa.getPrioridad_1().isEmpty()){
            if(programa.getPrioridad_2().isEmpty()){
                if(programa.getPrioridad_3().isEmpty()){
                    System.out.println("hola");
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
    
//        public Personaje escogerPeleador2(TV_Show programa){
//            Queue[ ] colas = new Queue[ ]{
//               programa.getPrioridad_1(),
//               programa.getPrioridad_2(),
//               programa.getPrioridad_3(),
//            };
//            
//            for (Queue cola : colas) {
//                if(!cola.isEmpty()){
//                    return cola.dequeue().getElement();
//                }
//            }
//            
//            System.out.println("todo vacio");
//            return null;
//    }
    
    
    //Aqui llamamos a las funciones que actualizan las colas de ambos programas
       public void aumentarContadorPersonajes(TV_Show programa){
           actualizarColas(programa.getPrioridad_1(), programa.getPrioridad_2());
           actualizarColas(programa.getPrioridad_2(), programa.getPrioridad_3());
    }
    
    
    //Aqui aplicamos la logica para actualizar el contador cada personaje en las colas
    public void actualizarColas(Queue prioridad_siguiente, Queue prioridad_actual){
        if(!prioridad_actual.isEmpty()){

        NodoPersonaje pointer = prioridad_actual.getHead();


          for (int i = 0; i < prioridad_actual.getLength(); i++) {
            pointer.getElement().aumentarContador();
            
            if(pointer.getElement().getContador() == 8){
                pointer.getElement().setContador(0);
                pointer.getElement().setPrioridad(  pointer.getElement().getPrioridad() - 1    );
                NodoPersonaje personaje = prioridad_actual.dequeue();
                prioridad_siguiente.enqueue(personaje.getElement());

            }
            else{
                pointer = pointer.getNext();
            }
        }
        }
        else{
            System.out.println("cola vacia");
        }
    }
  
    //Aqui se aplica la logica para actualizar la cola del refuerzo
    public void actualizarRefuerzo(TV_Show programa){
        NodoPersonaje personaje  = programa.getRefuerzo().dequeue();
        if( programa.getRefuerzo().isEmpty() ){
            System.out.println("El refuerzo esta vacio");
        }
        else{
            if(probabilidadSalirRefuerzo()){
                programa.getPrioridad_1().enqueue(personaje.getElement());
            }
            else{
                programa.getRefuerzo().enqueue(personaje.getElement());
                System.out.println("No hay chance de que salga. Ve de ultimo a la cola");
            }
        }

    }
    
        
    //Hay un 80% chance de crear un personaje nuevo, en esta funcion se calcula ese chance
    private boolean probabilidadCrearNuevoPersonaje(){
        double chance = Math.random();
        return chance >= 0.8;
    }
    
    //Hay un 40% chance de que los personajes en la cola del refuerzo salgan de esta cola, y vayan a la cola de prioridad 1
    private boolean probabilidadSalirRefuerzo(){
        double chance = Math.random();
        return chance >= 0.4;
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
