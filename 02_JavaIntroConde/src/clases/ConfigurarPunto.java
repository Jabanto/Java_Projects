package clases;

import java.awt.*;

/**
 * Created by Jefe Maestro on 11/09/2016.
 */
public class ConfigurarPunto {

    // CON ESTATIC SOO SE crea una variable de clase y soo existe un valor de esa variable , si no tuvieramos static
    // entonces se crearia nuevas variables  de tipo Point


     public static Point localizacion  ;

    public ConfigurarPunto(Point punticos) {

        this.localizacion = new Point(punticos);

    }

    public void setLocalizacion(){

        System.out.println("Empezar localizacion: ");
        System.out.println("X es igual a : " + localizacion.x);
        System.out.println("X es igual a : " + localizacion.y);
        System.out.println("-------------------------");
    }


    public void revisorStrings (){

        String str = "la estupidez siemrpe insistes";

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
