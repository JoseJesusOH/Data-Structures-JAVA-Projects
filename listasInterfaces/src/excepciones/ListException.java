/*
 * ListException.java
 */
package excepciones;

/**
 * Esta clase implementa la excepción lanzada por los metodos de las clases que
 * implementan la interfaz IList.
 */
public class ListException extends RuntimeException {

    /**
     * Constructor por omision
     */
    public ListException() {
        super();
    }

    /**
     * Constructor que establece un mensaje en la excepcion
     *
     * @param msj Mensaje para la excepcion
     */
    public ListException(String msj) {
        super(msj);
    }
}
