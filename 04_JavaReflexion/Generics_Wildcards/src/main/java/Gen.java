/**
 * Created by JAbanto on 19.06.2017.
 */
public class Gen <T extends Super> {


    public T value;


    public void foofoo()
    {
        System.out.println("Gen::foo");
        value.foo();
    }

}
