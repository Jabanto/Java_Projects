
/**
 * Created by JefeMaestro on 25.05.2017.
 */
public class Super {

    //diese wird zuerst aufgeruft vor als statis intantz vom Subklasse
    static {
        System.out.println("Super static Initializer");
    }

    {
        System.out.println("Super Intanzen initializer");
    }

    /**
     * ganz normal Konstruktor  wir d einfach hier sub Konstruktor ausgegeben
     */
    public Super() {

        System.out.println("Super Constructor");
    }

    /**
     *
     * @param i
     */
    public Super(int i){
        System.out.println("Super Constr with Para");
    }


}
