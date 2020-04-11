/**
 * Created by JAbanto on 13.06.2017.
 */
public class Generics {

    /**
     * Generische Methoden
     * @param args
     */

    public static void main(String[] args) {

        Gen<Sub> subGen = new Gen<Sub>();
        subGen.value = new Sub();
        subGen.foofoo();

        // hier rufen wir die statische Methode auf
        Super s = Generics.foo(new Sub());

    }

    /**
     * wir machen ein statische Methode , wir wissen nicht war für Type wir rückgeben
     * @param x wir geben etwas von typ x dann können wir die Methoden foo von super aufrufen und mit diesen object verwenden
     * @param <X>
     * @return
     */

    public static <X extends Super> X foo(X x)
    {
        x.foo();
        return x;
    }
}
