package clases;

import java.util.Random;
import java.util.Scanner;
import java.lang.System;

/**
 * Created by Jefe Maestro on 25/08/2016.
 */
public class Repeticiones {

    private Scanner miScamer = new Scanner(System.in);
    private int numIntentos = 0;
    private int nunAleatorios = new Random().nextInt(10 +1);
    private int numeroEscrito = miScamer.nextInt();

    public Repeticiones(){


        System.out.println("       ****** ******      ");
        System.out.println("       Bienbenido al juego  Acierta al numero!!!!    ");
        System.out.println("       ****** ******      ");
        System.out.println();
        System.out.println("       Escribe un numero del 1 al 10:      ");

        numIntentos++;


        // mientras no se cumpla la condicion se ejecuratarn las siguientes instrucciones
        while (numeroEscrito != nunAleatorios){

            System.out.println();
            System.out.println(" Intenta de nuevo... ");
            System.out.println(" Escribe un numero del 1 al 10");
            numeroEscrito = miScamer.nextInt();
            numIntentos++;
        }

        System.out.println("   Has Ganado despues de  ");
        System.out.println(numIntentos + "  intentos   ");

    }

}
