package com.outcast.javanto.clases;

import java.util.Random;
import java.util.Scanner;

/**
 * @author JefeMaestro
 * @Created  2016
 * Ejemplo practico utilizando de uso de la clase Random
 *
 */
public class RandomTool_Service {

    private Scanner miScamer = new Scanner(System.in);
    private int numIntentos = 0;
    private int nunAleatorios = new Random().nextInt(10 +1);
    private int numeroEscrito = miScamer.nextInt();

    public RandomTool_Service(){

        System.out.println("       ****** ******      ");
        System.out.println("       Bienvenido al juego  \"Acierta al número\"!!!!    ");
        System.out.println("       ****** ******      ");
        System.out.println();
        System.out.println("       Escribe un numero del 1 al 10:      ");

        numIntentos++;

        // mientras no se cumpla la condición se ejecutaran las siguientes instrucciones
        while (numeroEscrito != nunAleatorios){

            System.out.println();
            System.out.println(" Intenta de nuevo... ");
            System.out.println(" Escribe un número del 1 al 10");
            numeroEscrito = miScamer.nextInt();
            numIntentos++;
        }

        System.out.print("  Has Ganado despues de: ");
        System.out.println(numIntentos + "  intentos   ");
    }

}
