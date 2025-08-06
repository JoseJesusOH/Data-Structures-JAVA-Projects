

/*
* ListException.java
 */
package excepciones;

/**
 * Esta clase implementa la excepción lanzada por los metodos de las clases que
 * implementan la interfaz IQueue.
 */
public class QueueException extends RuntimeException {

    /**
     * Constructor por omision
     */
    public QueueException() {
        super();
    }

    /**
     * Constructor que establece un mensaje en la excepcion
     *
     * @param msj Mensaje para la excepcion
     */
    public QueueException(String msj) {
        super(msj);
    }
}
