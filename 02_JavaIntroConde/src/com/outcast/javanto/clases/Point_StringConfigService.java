package com.outcast.javanto.clases;

import java.awt.*;

/**
 * @author JefeMaestro
 *
 * Uso de la llamada a  Static , Uso de la clase Point
 * Ejemplo practico apra analizar un String
 *
 */
public class Point_StringConfigService {

    /**
     * Al utilizar el metodo de llamada Static cada vez que se inisilize Point_StringConfigService
     * se utilizara la misma instancio del tipo Point ya que es estatica sino lo fuera se crearian diferentes intancias
     * de el objeto Point
     */
    public static Point localizacion  ;

    public Point_StringConfigService(Point puntero) {

        this.localizacion = new Point(puntero);

    }

    public void setLocalizacion(){

        System.out.println("Empezar localizacion: ");
        System.out.println("X es igual a : " + localizacion.x);
        System.out.println("X es igual a : " + localizacion.y);
        System.out.println("-------------------------");
    }


    /**
     * Uso de los metodos mas usules de la Clase String
     */
    public void revisorStrings (){

        String str = "la estupidez siempre insiste";

        System.out.println("El string es :" + str);
        System.out.println("El tamaño de este string  :" + str.length());
        System.out.println("El caracter en la posicion 5:  " + str.charAt(5));
        System.out.println("El substring de 3 a 12  :" + str.substring(3,12));
        System.out.println("El index del caracter z :" + str.indexOf( 'z'));
        System.out.println("El index del inicio del :"+ "substring siempre : " + str.indexOf("siempre"));
        System.out.println("El String en mayusculas :" + str.toUpperCase());

        System.out.println("-------------------------");

    }

}
