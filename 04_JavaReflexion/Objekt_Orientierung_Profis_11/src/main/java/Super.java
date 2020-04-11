/**
 * Created by JefeMaestro on 25.05.2017.
 * In  diesem Tutorial  zeige ich euch dis statischen inneren Klassen
 * das sind Klassen in Klassen
 *
 */
public class Super {

    // definieren ein Atribut
    private int x = 5;
    private static int y = 10;


    // definieren ich eine Static Klassse, kann man auch public

    // kann ich nur die Klasse B in der Klasse Super initializieren
    // zum Beispiel das wir verwendt bei Arraya List mit Iterator
    private B b = new B();


    private static class B
    {
        // Kann ich Variable definieren
        // kann ich auch Variable auf private auf obere Klasse zugreifen
        // aber nicht alle :
        /** Kann ich nicht AUF DIE Private Variable X auf obere Klasse super zugreifen
         * denn statische Klasse sind unabhängig , also haben kein Verweis
         * auf diese obere Klassek, also wenn ich will
         *
         * int z = i muss ich zuerst die Super Klasse initializieren
         *
         * aber auf static Variable kann ich zugreifen wie varaible  y
         *
         */
        int z =  15;

        // static Variable kann man auch definieren
        private static int o = 20;
    }

}
