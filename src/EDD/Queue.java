package EDD;

import Clases.Personaje;

public class Queue implements IQueue {
    
    NodoPersonaje head, tail;
    int length;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public NodoPersonaje getHead() {
        return head;
    }

    public void setHead(NodoPersonaje head) {
        this.head = head;
    }

    public NodoPersonaje getTail() {
        return tail;
    }

    public void setTail(NodoPersonaje tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void enqueue(Personaje element) {
        NodoPersonaje nodo = new NodoPersonaje(element);
        if (isEmpty()) {
            setHead(nodo);
            setTail(nodo);
        } else {
            getTail().setNext(nodo);
            setTail(nodo);
        }
        length++;
        
    }

    @Override
    public NodoPersonaje dequeue() {
        if (isEmpty()){
            System.out.println("La cola esta vacía");
        } else{
            NodoPersonaje pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
        return null;
    }
    

    @Override
    public Object process() {
        if (isEmpty()){
            System.out.println("La cola esta vacia");
        }else{
            System.out.println("el elemento en turno es"+" "+getHead().getElement());
            return getHead().getElement();
        }
        return null;
    }

    @Override
    public NodoPersonaje dispatch() {
        if (isEmpty()){
            System.out.println("la lista esta vacia");
        }else{
            process();
            return dequeue();
        }
        return null;
    }
    
    public boolean isEmpty() {
        return getHead() == null;
    }
    
    public void print(){
        NodoPersonaje pointer = getHead();
        while (pointer != null) {
            System.out.println("[ " + pointer.getElement() + " ]");
            pointer = pointer.getNext();
        } 
    }


}
