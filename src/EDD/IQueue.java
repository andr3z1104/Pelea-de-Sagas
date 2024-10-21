package EDD;
import Clases.*;

public interface IQueue {
    public void enqueue(Personaje element);
    public NodoPersonaje dequeue();
    public Object process();
    public NodoPersonaje dispatch();
}
