/*
* IQueue<T>.java
 */
package interfaces;

import excepciones.QueueException;

/**
 * Esta es una interfaz generica que establece los métodos a implementar por una
 * clase que modele una Cola. 
 */
public interface IQueue<T> {

    /**
     * Agrega un elemento en el fin de la cola.
     *
     * @param t Elemento a agregar.
     * @throws QueueException Si la cola esta llena
     */
    public void enqueue(T t) throws QueueException;

    /**
     * Extrae el elemento del inicio de la cola.
     *
     * @return El elemento extraído.
     * @throws QueueException Si la cola esta vacia
     */
    public T dequeue() throws QueueException;

    /**
     * Inspecciona el elemento del inicio de la cola, sin extraerlo.
     *
     * @return El elemento inspeccionado.
     * @throws QueueException Si la cola esta vacia.
     */
    public T peek() throws QueueException;

    /**
     * Nos determina si la cola se encuentra vacia o no
     *
     * @return true si la cola se encuentra vacia, false en caso contrario.
     */
    public boolean empty();

}
