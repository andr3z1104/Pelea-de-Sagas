
package EDD;

import Clases.Personaje;

/**
 *
 * @author andre
 */
public class NodoPersonaje {
    
    private Personaje element;
    private NodoPersonaje next;
    
    /**
     *Constructor del nodo
     * 
     * @param element el elemento para ser guardado en el nodo
     */
    public NodoPersonaje(Personaje element){
        this.element = element;
        this.next = null;
    }

    /**
     *Obtiene el elemento guardado en el nodo
     * 
     * @return el elemento guardado en el nodo
     */
    public Personaje getElement() {
        return element;
    }

    /**
     *Setea el elemento para ser guardado en el nodo
     * 
     * @param element el elemento a ser guardado en el nodo
     */
    public void setElement(Personaje element) {
        this.element = element;
    }

    /**
     *Obtiene el siguiente nodo en la lista enlazada
     * 
     * @return el siguiente nodo
     */
    public NodoPersonaje getNext() {
        return next;
    }

    /**
     *Setea el siguiente nodo en la lista enlazada
     * 
     * @param next el siguiente nodo
     */
    public void setNext(NodoPersonaje next) {
        this.next = next;
    }
    
    
    
}
