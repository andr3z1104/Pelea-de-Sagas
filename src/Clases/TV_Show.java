
package Clases;

import EDD.*;
import java.util.Random;

/**
 *
 * @author andre
 */
public class TV_Show {
    
    private Lista oro;
    private Lista plata;
    private Lista bronce;
    
    private Queue prioridad_1 = new Queue();
    private Queue prioridad_2 = new Queue();
    private Queue prioridad_3 = new Queue();
    private Queue refuerzo = new Queue();

    public TV_Show(Lista oro, Lista plata, Lista bronce) {
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }
    
    
    //ENCOLAR
    public void crearQueue(NodoPersonaje nodo){
        
        switch (nodo.getElement().getPrioridad()) {
            case 1 -> this.prioridad_1.enqueue(nodo.getElement());
            case 2 -> this.prioridad_2.enqueue(nodo.getElement());
            case 3 -> this.prioridad_3.enqueue(nodo.getElement());
        }
        
    }
    
    public void enqueueRefuerzos(Personaje pj){
        this.refuerzo.enqueue(pj);
    }
    
    
    public void defininirNivelPersonaje(){
        
        int nivelCalidad = 0;
        
        double HP = Math.random();
        double FP = Math.random();
        double AP = Math.random();
        double habilidad = Math.random();
        
        if(HP <= 0.7 ){
           nivelCalidad += 1;
        }
        
        if(FP <= 0.5){
            nivelCalidad += 1;
        }
        
        if(AP <= 0.4){
            nivelCalidad += 1;
        }
        
        if(habilidad <= 0.6){
            nivelCalidad += 1;
        }
        
        // 0 - 1 Bronce
        // 2 - 3 Plata
        // 4 Oro
        
        
        NodoPersonaje nodo = new NodoPersonaje();

        if(nivelCalidad == 4){
             nodo = oro.searchByIndex(generarNumeroRandom(oro.getLength()));
        }
        else if(nivelCalidad == 3 || nivelCalidad == 2){
             nodo = plata.searchByIndex(generarNumeroRandom(plata.getLength()));
        }
        else{
            nodo = bronce.searchByIndex(generarNumeroRandom(bronce.getLength()));
        }
        
        System.out.println(nodo.getElement().getNombrePersonaje());
        
        crearQueue(nodo);
        
    }
    
    
    public int generarNumeroRandom(int sizeLista){
        
        if (sizeLista <= 0) {
        throw new IllegalArgumentException("La lista no puede estar vacía");
         }

        // Generar un número aleatorio entre 0 y tamañoLista - 1
        int rand =  new Random().nextInt(sizeLista);
        return rand;
}

    public Queue getPrioridad_1() {
        return prioridad_1;
    }

    public void setPrioridad_1(Queue prioridad_1) {
        this.prioridad_1 = prioridad_1;
    }

    public Queue getPrioridad_2() {
        return prioridad_2;
    }

    public void setPrioridad_2(Queue prioridad_2) {
        this.prioridad_2 = prioridad_2;
    }

    public Queue getPrioridad_3() {
        return prioridad_3;
    }

    public void setPrioridad_3(Queue prioridad_3) {
        this.prioridad_3 = prioridad_3;
    }

    public Queue getRefuerzo() {
        return refuerzo;
    }

    public void setRefuerzo(Queue refuerzo) {
        this.refuerzo = refuerzo;
    }
    
    
    
    
}