/**
 * Created by JefeMaestro on 25.05.2017.
 */
public class Sub

{

    public static void main(String[] args) {

        Super s = new Super();
        Super.B b = s.new B();

        /**
         * wir könne nur diese B aufrufen nur mit Super.B
         */
        System.out.println(b.getX());
        // diese Klasse be kann mache was sie wills mit der obere Klasse
        b.foo();

        System.out.println(b.z);

    }

}
