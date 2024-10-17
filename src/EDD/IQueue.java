package EDD;


public interface IQueue {
    public void enqueue(Nodo element);
    public Nodo dequeue();
    public Object process();
    public Nodo dispatch();
}
