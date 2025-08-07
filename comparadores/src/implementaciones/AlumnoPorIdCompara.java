/*
  * AlumnoPorIdCompara.java
 */
package implementaciones;

import interfaces.ICompara;
import tipos.Alumno;

/**
 * Esta clase implementa la interfaz ICompara para comparar objetos de tipo
 * Alumno por su id. 

 * @param <T> Tipo de los datos a comparar
 */
public class AlumnoPorIdCompara<T> implements ICompara<T> {

    /**
     * Compara como objetos del tipo Alumno, los objetos de los parametros o1 y
     * o2. La comparación es por el Id
     *
     * @param o1 Objeto a comparar.
     * @param o2 Objeto a comparar.
     * @return Un numero negativo, cero o un numero positivo si o1 es menor que,
     * igual a o mayor que o2.
     */
    @Override
    public int compara(T o1, T o2) {
        return ((Alumno) o1).getId().compareTo(((Alumno) o2).getId());
    }
}
