import sun.security.x509.GeneralSubtree;

import java.util.ArrayList;

/**
 * Created by JAbanto on 19.06.2017.
 * es geht um die Wildcars , einer Methode um generishe Klassen noch mehr zu verallgemeinern.
 * es geht um bei Wildcards um anonymen Typs Parameter , dass haben wir bis jetzt ein spezifisches X , das entweder ein Sub typ ist oder Super
 * war ein Problem man konnten dieses X y richtigt ensprechend und dass kann Fehler erzeugen
 *
 *
 */
public class Generics {

    public static void main(String[] args) {

        Gen<Sub> gens = new Gen<Sub>();
        //Gen<Sub3> sub3Gen = new Gen<Sub3>();

        gens.value = new Sub();

        gens.foofoo();
        /**
         * hier brauche ich egentlich ein Sub
         */
        Gen<Super> g= new Gen<Super>();
        f(g);


    }

    // static damit wir direct aufrufen kann
    public static void f(Gen<? super Super> g )
    {
        g.foofoo();
        Super s = g.value;
        // ich darf jedes unterklasse
        g.value = new Sub();
    }

    public static <X extends Super> X foo(X x)
    {
       x.foo();
       return x;
    }

}
