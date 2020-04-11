
/**
 * Created by JefeMaestro on 25.05.2017.
 */
public class Super {

    int i = 15;
    //diese wird zuerst aufgeruft vor als statis intantz vom Subklasse
    static {
        System.out.println("Super static Initializer");
    }

    {
        System.out.println("Super Intanzen initializer");
        // wenn ich jezt hier object erstelle dann bekommen ich ein null
        foo();

    }

    /**
     * ganz normal Konstruktor  wir d einfach hier sub Konstruktor ausgegeben
     */
    public Super() {

        System.out.println("Super Constructor");
    }

    public Super(int i){
        System.out.println("Super Constr with Para");
    }


    // Wenn wir diese Methoden machen wir ihm Private , dann passiert folgendes
    // dann wird i foo 15 eingeben , und wird nicht vererbt also wenn wir können machen wir private
    // oder final dazu kommt mehr noch , final heiss dass der Methoden nicht überschreiben sein
    /*
     also ist besser keine public Methode auf ein Konstrutur aufrufen an soonstens Private deklarieren
     wir hier her
     */
    private void foo(){
        System.out.println("Super foo " + i);
    }

}
