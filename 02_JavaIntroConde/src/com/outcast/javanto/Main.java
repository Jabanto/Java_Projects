package com.outcast.javanto;
import com.outcast.javanto.clases.*;
import com.sun.xml.internal.bind.v2.TODO;

import java.awt.*;

public class Main {

    /**
     * Este Projecto describe partes importantes y basicas de un programa OOP
     * Descripcion del metodo main
     * Es un metodo de clase , es decir no se crea automaticamente una instancia de que contiene el Metodo main()
     * Public en el metodo main quiere decir que esta disponible en otra classe y objetos
     * Static significa que es un metodo de clase Main solo aplicable aqui
     * Void que no devuele valores donde entre los { se escribe el codigo de programa}
     *
     * @autor Javanto
     * @param args toma un parametro que es un array de String , esto significa que el ejecutable se puede ejecutar ingresando parametros
     *             por ejemplo llamar al programa usando cmd y agregando al .exe parametros
     * @TODO Add new command menu to execute all clases on this main method
     */

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

        CalenderService nuevoCalender = new CalenderService();
        nuevoCalender.mostrarSaludo();

        ArrayService nuevo = new ArrayService();
        nuevo.getMarcaImpresotas();

        //Repeticiones nuevoJuego = new Repeticiones();

        LoopService nuevoLoop = new LoopService();
        nuevoLoop.loopy();
        nuevoLoop.loop2();
        //nuevoLoop.loopDo();
        //nuevoLoop.continueLoop();
        //nuevoLoop.saliryNombreLoops();

        // Arrays

        ArrayService nuevoArray = new ArrayService();
        nuevoArray.eliminarEspacio();

        //herencias y super clases;

        Point objeto1 = new Point(11,22);
        SuperClass_Service objeto2 = new SuperClass_Service(7,6,64);

        objeto2.comprobarPunto2D(objeto1.x,objeto1.y);
        objeto1.move(4,13);
        objeto2.posicionFinalPunto2D(objeto1.x,objeto1.y);
        objeto1.translate(-10,-10);
        objeto2.trasladarPunto2D(objeto1.x,objeto1.y);

        objeto2.move(10,22,71);
        objeto2.translate(-20,-20,-20);

        Tokenizer_Service nuevoToken = new Tokenizer_Service();
        nuevoToken.tokenTest();

        Point_StringConfigService puntoPelota = new Point_StringConfigService(new Point(4,6));
        puntoPelota.setLocalizacion();
        puntoPelota.revisorStrings();

        Referencias_Service nuevoCasting = new Referencias_Service();
        nuevoCasting.raisCastingStringAint("1254");
        nuevoCasting.raisCastingStirngASCII("144");

        ScopeService alcanzeValor = new ScopeService();
        alcanzeValor.imprimirTest();

        StringCase_ConverterService convertidor1 = new StringCase_ConverterService();
        convertidor1.aMayusculas(args);

    }
}
