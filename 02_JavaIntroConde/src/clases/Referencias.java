package clases;

import java.awt.*;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Jefe Maestro on 14/09/2016.
 * TEMA REFERENCIAS Y CASTING : TRANSFORMAR INFORMACION
 */
public class Referencias {

    private Point pt1, pt2;


    public Referencias(){}

    public Referencias(int x, int y){

        /*
        * en las siguientes lines pt2 tendra el mismo valor de pt1 ya que el = indica una referencia a pt1
        * */

        this.pt1= new Point(x,y);
        this.pt2 = pt1;

        System.out.println("Point1: " + pt1.x + ", " + pt1.y);
        System.out.println("Point2: " + pt2.x + ", " + pt2.y);
    }
    /*
    * CASTING de variables simples, entre variables numericas enteros adecimales , los boolean no se pueden convertirse
    *
    * casting a int de un float con parentesis
    * casting implicitos si el destino contine mas largos que afuente no hay problema , si un byte a intger no hay problema pero alreves no
    * */

    public void  castingVariableSimpleImplicito (byte meterFloat){

        int destino = (int)meterFloat;
        System.out.println("Referencias.castingVariable es te es un casting implcito " + destino );
        System.out.println("------------------");

    }

    public void  castingVariableSimpleExplicito (int meterInt){

        byte destino = (byte) meterInt;
        System.out.println("Referencias.castingVariable es te es un casting explicito de int a byte tu sabras lo que haces!! " + destino );
        System.out.println("------------------");

    }


    /*
    * CASting entre objeto es necesario que la fuente z el destino esten relacionadas con herencias
    * se pude hacer casting de una subclase a una superclase , tendra todito de su superclase o de una superclase a una subclase
    * todas las clase de java son subclase de Object
    * el problema puede psar alreves se decir de superclase a subclase, si la subclase tine mas info que la superclase
    * puede que esa super clase pierda imformacion, tenemos que hacer un cast explicito
    *
    *
    * */

    public void castinsEntreObjetos(){

        Point comp = new Point(7,5);
        Punto3D comp3D = (Punto3D)comp;

        System.out.println("conversion explicita de point a superclase Point3D");

    }

    /*
    * CASTING entre variables primitivas y objetos
    * este no es posbile en java, en general , pero existen classe para cada variable primitiva
    * que nos permiten hacer e casting que empiezan por mayusculas ya que son clases
    *
    * */

    public void castingVariabeaObjeto(){

        Integer cantida = new Integer(1245);
        int nuevaCantidad = cantida.intValue();

    }

    /*
    *Convertir un String en valor numerico
    * uno de los caso mas comunes es obtener un valor objeto String lo que queremos usar en un valor numerico
    * mediante el uso del etodo parseInt() de la clase String
    *
    * */


    public void raisCastingStringAint(String args){

        int numero = 100;

        if (args.length()>0){

            numero = Integer.parseInt(args);
        }
        System.out.println("la raiz cuadrada de " + numero + "es " + Math.sqrt(numero));
        System.out.println("---------------");
    }

    public void raisCastingStirngASCII(String str){

        System.out.println("Escribe un numero");
        int conversion = Integer.parseInt(str);
        System.out.println("Ls raiz cuadrada de " + conversion+ " es " + Math.sqrt(conversion));
        System.out.println("-------------");
    }

    /*
    * Apartir de java 5 tenemos una nueva afuncionalidad Autoboxing y unboxing.
    * que es la conversion automatica entre tipos primitivos y objetos equivalente y viceversa
    * ejemplos
    *
    * Int I = 0;
    * I = new Integer(5); // Auto-unboxing de variabla a Objeto de tipo primitivo int
    *
    *Integer I2 = 5 ; // seria Autoboxing de Objeto a variable equivalente sin el uso de() como casting entre variables y objetos
    * */

}



