
package Clases;

import EDD.Lista;
import EDD.NodoPersonaje;
import EDD.Queue;
import UI.UI_Controlador;

/**
 *
 * @author andre
 */
public class Admin extends Thread {
    
    private AI ai;
    
    private TV_Show colasStarWars; // TV_Show contiene 4 colas
    private TV_Show colasStarTrek; // TV_Show contiene 4 colas

    public Admin(AI ai, Lista OroStarWars, Lista PlataStarWars, Lista BronceStarWars, 
                             Lista OroStarTrek, Lista PlataStarTrek, Lista BronceStarTrek) {
        
        this.ai = ai;
        
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
        
        NodoPersonaje pointer = this.colasStarWars.getPrioridad_1().getHead();
        while (pointer != null) {
            System.out.println("[ " + pointer.getElement().getHP() + " ]");
            pointer = pointer.getNext();
        } 
        
                NodoPersonaje pointer2 = this.colasStarTrek.getPrioridad_1().getHead();
        while (pointer2 != null) {
            System.out.println("[ " + pointer2.getElement().getHP() + " ]");
            pointer2 = pointer2.getNext();
        }
        
   
  
        UI_Controlador.getGolpe().actualizarColaUI(this.colasStarWars.getPrioridad_2());
             UI_Controlador.getGolpe().setVisible(true);
    }
    
    @Override
    public void run(){
        while(true){
             
            //Se aumenta los contadores para evitar la inanicion
            aumentarContadorPersonajes(this.colasStarWars);
            aumentarContadorPersonajes(this.colasStarTrek);
            
            //Cada 2 Rounds, el admin agrega un nuevo personaje a cada TV_Show, si y solo, la funcion retorna true
            if(probabilidadCrearNuevoPersonaje()){
                this.colasStarWars.defininirNivelPersonaje();
                this.colasStarTrek.defininirNivelPersonaje();
            }
            
            actualizarRefuerzo(this.colasStarWars);
            actualizarRefuerzo(this.colasStarTrek);

        }
    }
    
    //Aqui llamamos a las funciones que actualizan las colas de ambos programas
       public void aumentarContadorPersonajes(TV_Show programa){
           actualizarColas(programa.getPrioridad_1(), programa.getPrioridad_2());
           actualizarColas(programa.getPrioridad_2(), programa.getPrioridad_3());
    }
    
    
    //Aqui aplicamos la logica para actualizar el contador cada personaje en las colas
    public void actualizarColas(Queue prioridad_siguiente, Queue prioridad_actual){
        
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
  
    //Aqui se aplica la logica para actualizar la cola del refuerzo
    public void actualizarRefuerzo(TV_Show programa){
        if( programa.getRefuerzo().isEmpty() ){
            System.out.println("El refuerzo esta vacio");
        }
        else{
            if(probabilidadSalirRefuerzo()){
                NodoPersonaje personaje  = programa.getRefuerzo().dequeue();
                programa.getPrioridad_1().enqueue(personaje.getElement());
            }
            else{
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
    
    
 
    
    
    
    
    
}
