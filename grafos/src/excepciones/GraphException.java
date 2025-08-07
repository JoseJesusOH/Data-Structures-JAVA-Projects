/*
* GraphException.java
 */
package excepciones;

/**
 * Esta clase implementa la excepcion lanzada por los metodos de las clases que
 * implementan la interfaz IGraph. 
 */
public class GraphException extends RuntimeException {

    /**
     * Constructor por omision
     */
    public GraphException() {
        super();
    }

    /**
     * Constructor que establece un mensaje en la excepcion
     *
     * @param msj Mensaje para la excepcion
     */
    public GraphException(String msj) {
        super(msj);
    }
}
