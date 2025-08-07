/*
* TreeException.java
*/
package excepciones;
/**
* Esta clase implementa la excepción lanzada por los metodos de la
* clase que implementa la interfaz ITree.
*/
public class TreeException extends RuntimeException {
/**
* Constructor por omision
*/
public TreeException() {
super();
}
/**
* Constructor que establece un mensaje en la excepcion
* @param msj Mensaje para la excepcion
*/
public TreeException(String msj) {
super(msj);
}
}