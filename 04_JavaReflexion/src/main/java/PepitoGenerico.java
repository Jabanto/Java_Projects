/**
 * Created by JefeMaestro on 06.05.2017.
 *
 * ahroa estoy genereado una clae genericas que solo se puede convertir en  valores double , long
 * es decir con generics puedo limitar a que se puede convertir mi clase generica
 * y tod esto es tiemnpo de compilacion es clave para evitar errores o valores otypos no deseados
 */
public class PepitoGenerico<T extends Number> {

    // definimos cammpo genrrico con T
    public T unObjeto;
    public T segundobjeto;
    public T getUnObjeto(){
        return unObjeto;
    }
    public double sumar(){
        // para poder hacer sumar los campo genercios lo debemos convertir en valores dobble por ejemplo
        // para ello utilisamos doubleValue, es decir todos los objeto genricos que extiendo de la clase number puedo usar ese methodo
        return unObjeto.doubleValue() + segundobjeto.doubleValue();
    }


}
