
package EDD;

import Clases.Personaje;

/**
 *
 * @author andre
 */
public interface iLista {
    
    /**
     *Inserta un elemento al principio de la lista
     * 
     * @param element el elemento a insertar
     */
    public void insertBegin(Personaje element);

    /**
     *Inserta un elemento al principio de la lista
     * 
     * @param element el elemento a insertar
     */
    public void insertFinale(Personaje element);

    /**
     *Inserta un elemento a un indice especificado
     * 
     * @param element el elemento a insertar
     * @param index el indice al cual se insertar el elemento
     */
    public void insertAtIndex(Personaje element, int index);
    
    /**
     *Borra el primer elemento de la lista
     * 
     * @return el elemento borrado
     */
    public NodoPersonaje deleteBegin();

    /**
     *Borra el ultimo elemento de la lista
     * 
     * @return el elemento borrado
     */
    public NodoPersonaje deleteFinale();

    /**
     *Borra un elemento en un indice especificado
     * 
     * @param index el indice del elemento a borrar
     * @return el elemento borrado
     */
    public NodoPersonaje deleteAtIndex(int index);
    
    /**
     *Checkea si una lista esta vacia
     * 
     * @return true si esta vacia, falso de lo contrario
     */
    public boolean isEmpty();
    
}
