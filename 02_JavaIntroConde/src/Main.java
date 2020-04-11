import clases.*;

import java.awt.*;

/**
 * Created by Jefe Maestro on 14/08/2016.
 */
public class Main {


    /*
    * DEScripcion del metod main
    *
    * es un metodo de clase , es decir no se crea automaticamente una onstacio de la clase que contiene el
    * Metodo main()
    *
    * public quiere decir que esta disponible en otrs classe y objetos
    *
    * static significa que es un metodo de clase Main solo aplicable aqui
    *
    * void que no devuelve valores
    *
    * main(String[] args) toma un parametro que es un arraz de
    * Strings
    * {} el codigo nesecario par inicar nuestra aplicacion
    *
    * */
    public static void main(String[] args) {




        System.out.print("Tu peso en la Tierra es de ");
        double pesoDbl = 72;
        System.out.println(pesoDbl + " Kg");

        System.out.print("Tu peso en Mercurio es de ");
        double mercurioDbl = pesoDbl*.378;
        System.out.println(mercurioDbl + " Kg");

        System.out.print("Tu peso en la Luna es de ");
        double lunaDbl = pesoDbl*.166;
        System.out.println(lunaDbl + " Kg");

        System.out.print("Tu peso en Jupiter es de ");
        double jupiterDbl = pesoDbl*2.364;
        System.out.println(jupiterDbl + " Kg");

        System.out.println("----------------");

       float fahFl = 86;
        System.out.println(fahFl + " grados Fahrenheit son ...");
        fahFl = fahFl -32;
        fahFl = fahFl / 9;
        fahFl = fahFl *5;
        System.out.println(fahFl + " grados Celcius");

        float celFl = 33;
        System.out.println(celFl + " grados Celsius son ...");
        celFl = celFl *9;
        celFl = celFl / 5;
        celFl = celFl +32;
        System.out.println(celFl + " grados Fahrenheit  ");

        Que nuevoQue = new Que(5);

        nuevoQue.comprobar("Verde");
        nuevoQue.condicional(5);

        Calender nuevoCalender = new Calender();
        nuevoCalender.mostrarSaludo();

        Array nuevo = new Array();
        nuevo.getMarcaImpresotas();

        //Repeticiones nuevoJuego = new Repeticiones();

        loopFor nuevoLoop = new loopFor();
        nuevoLoop.loopy();
        nuevoLoop.loopz2();
        //nuevoLoop.loopDo();
        //nuevoLoop.continueLoop();
        //nuevoLoop.saliryNombreLoops();

        // Arrays

        Array nuevoArray = new Array();
        nuevoArray.eliminarEspacio();

        //herencias y super clases;

        Point objeto1 = new Point(11,22);
        Punto3D objeto2 = new Punto3D(7,6,64);

        objeto2.comprobarPunto2D(objeto1.x,objeto1.y);
        objeto1.move(4,13);
        objeto2.posicionFinalPunto2D(objeto1.x,objeto1.y);
        objeto1.translate(-10,-10);
        objeto2.trasladarPunto2D(objeto1.x,objeto1.y);

        objeto2.move(10,22,71);
        objeto2.translate(-20,-20,-20);

        Tokenizer nuevoToken = new Tokenizer();
        nuevoToken.tokenTest();

        ConfigurarPunto puntoPelota = new ConfigurarPunto(new Point(4,6));
        puntoPelota.setLocalizacion();
        puntoPelota.revisorStrings();

        Referencias nuevoCasting = new Referencias();
        nuevoCasting.raisCastingStringAint("1254");

        nuevoCasting.raisCastingStirngASCII("144");

        ListarRango alcanzeValor = new ListarRango();

        alcanzeValor.imprimirTest();

        Convertidor convertidor1 = new Convertidor();

        convertidor1.aMayusculas(args);

    }
}
