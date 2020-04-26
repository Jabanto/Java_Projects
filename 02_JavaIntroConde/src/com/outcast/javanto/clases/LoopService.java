package com.outcast.javanto.clases;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author JefeMaestro
 * @Created on 2016
 *
 * Usos  basicos con ejemplos de loops en java y metodos mas usuales
 *
 */
public class LoopService {

    public LoopService(){

    }

    /**
     * Ejemplo basico de ciclo for con lecturae interpretacion del encabezado
     */
    public void loopy(){

        // Esta linie de codigo no queria decir, configura el contador a 1  y mientras sea menos de 10 añande 1 al contador que tiene valor 1
        // for (inicializacion, expresion (evalua),actualizacion del valor inicializado de algun modo aqui o fuera de este encabezado)

        for (int contador = 1; contador <= 10; contador++){

            System.out.print("  el Valor del Contador es  ");
            System.out.print(contador);
            System.out.println(" . ");
        }
        System.out.println("      HECHO!   ");
        System.out.println("       ****** ******      ");
    }

    public void loop2(){

        System.out.println("       ****** ******      ");
        for (int x =1; x <=20; x++){
            int multiplo = 7*x;
            System.out.print( multiplo + " ");
        }
        System.out.println("       ****** ******      ");
    }

    // el ciclo do while siempre se ejecutara almenos una vez el codigo en cambio el while depende de la condicion
    public void loopDo(){
        File archivo = new File("c:\\miArchivo.txt");
        Scanner miScanner = new Scanner(System.in);
        char replica;
        do {
            System.out.print("borrar archivo ? s/n");
            replica = miScanner.findWithinHorizon(".",0).charAt(0);}
        while (replica != 's' && replica != 'n'&& replica != 'N'&& replica != 'S');
        if (replica ==  'S'|| replica == 's' ){
            System.out.print("deacuerdo, borrando archivo..");
            archivo.delete();
        }else {
            System.out.print("deacuerdo, confirmado no borrar");
        }
    }

    // Uso basico de la clausula break dentro de un Loop
    public void breakLoop(){

        int index = 0;
        while (index <=1000){
            index = index + 5;
            System.out.println(index);
            if (index == 400){
                System.out.println("Index = 400 saliendo...");
                // detenemos el Loop aunque no se cumpla la condicion index<= 1000
                break;
            }
        }
    }

    // Uso basico de la clausula continue dentro de un Loop fcv
    public void continueLoop(){

        int indexC = 0;
        while (indexC<=100){
            indexC= indexC + 5;
            if (indexC == 40)
                // si index es igual a 40
                // una iteraccion no se imprime pero la siguiente si
                // continue hace que se salte o no se muestre el valor de indexc cuando este valga 40
                continue;
            System.out.println("El index es " + indexC);
        }
    }

    // Uso basioc de Loops for y shile juntos
    public void loopdelLoop(){

        int points = 0;
        int target = 100;
        while (target<= 100){
            for (int i = 0; i < target;i++){
                if (points > 50){
                    System.out.println("Saliendo del loop for");
                    break;
                } points = points +1;
            }
        }

    }

    // Uso de target loop para salir con break de un doble loop
    public void saliryNombreLoops(){
        int point = 0;
        int target = 100;
        targetLoop:
        while (target <= 100){
            for (int i =0;i<target;i++){
                if (point > 50){
                    System.out.println("--------------------");
                    System.out.println("points = " + point);
                    System.out.println("saliendo de los dos Loops");
                    System.out.println("--------------------");
                    break targetLoop;
                }
                point = point +i;
            }
        }
    }

    // uso de dos valores o condicionales en loop
    public void loopsComplejos(){

        int i, j;
        for (i=0,j=0; i*j <10; i++,j++){

            System.out.println("---------------");
            System.out.println(i + " * "+j+ " "+ (i*j));
            System.out.println("---------------");
        }
    }


    // Uso y practica del calendario gregoriano uso de metodos basicos
    public void loopMedidordevelocidad(){

        Calendar start = Calendar.getInstance();
        int startMinute = start.get(Calendar.MINUTE);
        int startSecond = start.get(Calendar.SECOND);
        // mover el tiempo un minuto con metodo rollint nextMinute = start.get(Calendar.MINUTE);
        int nextSecond = start.get(Calendar.SECOND);
        int nextMinute = start.get(Calendar.MINUTE);
        int index = 0;
        while (true ){
            double x = Math.sqrt(index);
            GregorianCalendar now = new GregorianCalendar();
            if (now.get(Calendar.MINUTE)> nextMinute){
                if (now.get(Calendar.SECOND)>= nextSecond){
                    break;
                }
            }
            index++;
        }
        System.out.println(index + "loops en un Minuto. ");
    }
}
