/**
 * Created by JefeMaestro on 25.05.2017.
/**
 *  In diesem Tutorial zeige ich Euc die Problen und Tücken der dynamioschen Bindung in Konstruktoren
 *  und Initilizern
 * */
public class Sub  extends Super{

    int i = 5;
    static {
        System.out.println("Sub static Initializer");
    }

    {
        System.out.println("Subklasse Intanzen initializer");
        /**
         *  So veerbte Methode können auch einfach in die Initizializer benutzen
         *  bekoomen foo + 0 denn die Klasse noch nich initiliziert sind
         */
        foo();
    }
    public Sub() {

        super();
        System.out.println("Subklasse Constructor");
    }

    public Sub(int i){

        // hier rufen wir den Kontructro mit Parametter von der SuperKlasse auf

        // wenn wir ein Anweisung voher als super() schreiben bekommen ein Fehler den wird immer zuerst aufgeruft
        //System.out.println("Sub Contructor");
        super(i);
        System.out.println("Subklasse Contructor with param");
    }

    public static void main(String[] args) {

        new Sub();
    }

    public void foo(){
        System.out.println("Sub Foo  " +  i);
    }

}
