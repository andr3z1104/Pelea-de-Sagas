
package Clases;

import EDD.Lista;
import EDD.NodoPersonaje;

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
        
    }
    
    
    
    
    
    
}
