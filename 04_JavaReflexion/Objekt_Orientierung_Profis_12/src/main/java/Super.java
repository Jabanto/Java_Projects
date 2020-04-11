/**

 * Created by JefeMaestro on 25.05.2017.
 * hier zeige cih euch inneren Klassen mit Referent auf "Aussenobjekt"
 */

public class Super {
     private int x =  5;
     static int y = 10;

     B b = this.new B();

    /**
     * diese Klasse B kann nur mit einer Initializierung von der Klasse supoer aufgerufen werden kann
     * jedes B ist verbundet mit Super . das selbe für die Methoden
     */
    public class B
     {
         // mir super , denn nur ein einziges mal exitiert

         int  z = Super.y;
          // kann ich auf Variable zugreifen
         public int getX()
         {
              // dann greifen auf Variable X von der SuperKlasse
              //return Super.this.x; ist das Syntax aber funktioniert auch folgende Text
              return x;
         }

          public void foo() {
               x++;

          }
     }

}
