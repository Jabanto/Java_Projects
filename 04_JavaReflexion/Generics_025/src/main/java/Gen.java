/**
 * Created by JAbanto on 13.06.2017.
 */

// hier haben ein mehrere generische Klasse erstellen.
//public class Gen<T extends Super & Super2, S extends Super> {

public class Gen<T extends Super> {

    public T value;
    //public S value2;

    public void foofoo(){

        System.out.println("Genn::foo");
        value.foo();
        //value.bar();
        // value2.foo();

    }

}
