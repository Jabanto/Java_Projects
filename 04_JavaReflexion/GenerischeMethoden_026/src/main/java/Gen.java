import java.util.ArrayList;

/**
 * Created by JAbanto on 13.06.2017.
 */
public class Gen<T extends Super> {



    String[] manu ;

    ArrayList<Integer>meineListe = new ArrayList<Integer>();

    public T value;

    public void foofoo(){
        System.out.println("Gen::foo");
        value.foo();
    }

}
