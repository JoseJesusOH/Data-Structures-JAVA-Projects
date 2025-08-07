/*
* StackException.java
 */
package excepciones;

/**
 * Esta clase implementa la excepción lanzada por los metodos de las clases que
 * implementan la interfaz IStack.
 *
 */
public class StackException extends RuntimeException {

    /**
     * Constructor por omision
     */
    public StackException() {
        super();
    }

    /**
     * Constructor que establece un mensaje en la excepcion
     *
     * @param msj Mensaje para la excepcion
     */
    public StackException(String msj) {
        super(msj);
    }
}
