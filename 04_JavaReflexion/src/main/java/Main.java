import Threads.CustomThread;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JefeMaestro on 05.05.2017.
 */
public class Main {

    public static void main(String[] args) {

        /*
    *
    *  THREAD 1
    *   Wir ertellen hier Custom Thread
    *   Es geht um Thread , unsere Anwendungen Laufen normalaweise in ein Kern aber durch Threads könne gleicheitig in andere Kern laufen
    *   und damit unsere Geschwindigkeit von Programm austeigt.
    *
    */

        //Multithreading II wie ich Trheads syncronisieren kann, zo in eine Variable nicht gleichzeitig zugreifen sondern neinander

        Integer counter = 0;

        //

        CustomThread t1 = new CustomThread("Erste Thread " , counter);
        CustomThread t2 = new CustomThread("Zweiter Thread", counter);

        // Sie starte zuerst mein Erste Thread und danch meine Zweiter , also beides laufen
        // Parallel, also laufen gleichzeitig ein auf meine erste kern und den anderen in Zweiter Kern
        // deshlab könnte sein dann the Thread nicht in richtige Reienfolge , also laufen  richtig Random

        t1.start();
        t2.start();

        // wie kann warte bis einzige Threads beendet sind
        // diese Methode join muss sourrender mit try/Catch

        try {
            t1.join();
            // warte bis t1 total beendet ist also mn
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // diese Ausgabe wird gezeigt wenn die Threads total beendet sind
        System.out.println("Ende des Programms");


        //Java Reflexion
        // funciona en tiempo de ejecucion, una vez que esta corriendo en la Virtual machine
        // Por un lado los usos
        // viene util cuando se habla de inversion de control
        // la posibilidad de tener bjetos que de alguna forma tenga relacion pero que no esten
        // relacionados
        // la inversion de control es para eliminar la dependencia, pero que tengan relacion
        // al  tener una clase que imlemeta inversion de control
        // es facil aplicar la reflexion ya
        // con reflexion podemos pedri informacion de una clase
        // por ejemplo intelli funciona asi
        // o podemos utilizar reflexion para ejecutar programa o  methodos
        // solo recomdable apara el desarrolo con frameworks como Spring
    /*
    *
    *
    *
    */
    try {
        Class myClass  = Class.forName("Pepito");

        Field fld = myClass.getDeclaredField("unint");

        System.out.println(fld.getType());

        Constructor constructor = myClass.getConstructor();

        System.out.println(constructor.getName());

        Method mtd[]  = myClass.getMethods();



        System.out.printf(mtd[0].getName());


    }catch (Exception e)
    {

    }

    // Ejecutar codigo por reflexion

        try {

        Class clazz =  Class.forName("Pepito");

        String metodo = "saludaPepito";

        Class clases[] = {String.class};

        Object ob;

        ob = clazz.getConstructor(null).newInstance(null);
        clazz.getMethod(metodo, clases).invoke(ob,"");

        }catch (Exception e){}

     /*
        *Java Reflexion tiene problemmas de Performance
        *  1 el codigo de maquina , esta adaptado para que funcione en la java virtual machine
        *  cuando agregamos o arrancamos methodos por reflexxion nos saltamos
        *  pasos basicos que se hacen al compilar lo que puede producir errores
        *
        *  2 la seguridad ya que por reflkexion unos puede invocar methodos a campos privados
        *
        *  3 el problema de modificar comportamiento , podria estar saltandosde un montonun conportamientos
        *  que se llamban antes , asi romperiamos la estructura y la arquitectura de un programma
        *  por eso es muy especifico para frameworks
         */

    // Java se maneja por Versiones apartri de la version  5 se empezo usar los Genericcs
    // veamos un ejemplo antes de Genereics

    /*
        List lista = new ArrayList();
        lista.add("pepito");
        lista.add(1);

            // para obtener un valor la lista por ejemplo pepeitp
            // estoy obligado ha csating por que el methodo get devuelve un Object

        //String j = (String)lista.get(0);
        //System.out.printf(j);
        //Pero si llammanos al segundo valor el int
        String j = (String)lista.get(1);
        // non habra un problema de compilacion pero si tendremosun problema en tiempo de ejecucion
        System.out.printf(j);
    */

        /*
        * Hasta que no aparecio generics no podiamos  salvar errores en tiempo de ejecuccion
        * ahora parmetrizar la classe
         */
        // una lista que es algo generico pasa  ha ser algo especifico y ya no tendremos errores de ejecuccion
        /*
            List<String> Lista = new ArrayList<String>();
            lista.add("pepito");
            String jg = Lista.get(0);
        // ahora ya nos hago casting ya que la lista es go particular ya que ahora list es un generico y luego
        // la volvemos en un clase en particular
        //System.out.printf(jg);

        PepitoGenerico<Double> p = new PepitoGenerico<Double>();

        p.unObjeto = 4.5;
        p.segundobjeto  = 5.5;
        System.out.println(p.sumar());
        */

    }


}
