package com.outcast.javanto.clases;


import java.awt.*;

/**
 * Usos basico de las referencias de valores en java y ekl cuso de casting para convertir variables
 */
public class Referencias_Service {

    private Point pt1, pt2;

    public Referencias_Service(){}

    public Referencias_Service(int x, int y){

        /**
         * en las siguientes lineas pt2 tendra el mismo valor de pt1 ya que el = indica una referencia a pt1
         * */

        this.pt1= new Point(x,y);
        this.pt2 = pt1;

        System.out.println("Point1: " + pt1.x + ", " + pt1.y);
        System.out.println("Point2: " + pt2.x + ", " + pt2.y);
    }

    /**
     * CASTING de variables simples, entre variables numericas enteros a decimales , los boolean no pueden convertirse
     * Casos utilizados en este metodo son:
     * Casting a int de un float con parentesis
     * Casting implicitos si el destino contine mas largos que la fuente no hay problema , si un byte a integer no hay problema pero alreves no
     * */
    public void  castingVariableSimpleImplicito (byte meterFloat){

        int destino = (int)meterFloat;
        System.out.println("Referencias.castingVariable es te es un casting implcito " + destino );
        System.out.println("------------------");

    }

    public void  castingVariableSimpleExplicito (int meterInt){

        int destino = (byte) meterInt;
        System.out.println("Referencias.castingVariable este es un casting explicito de int a byte tu sabras lo que haces!! " + destino );
        System.out.println("------------------");

    }


    /*
     * CASTING entre objetos es necesario que la fuente y el destino esten relacionadas con herencias
     * se pude hacer casting de una subclase a una superclase , tendra todito de su superclase o de una superclase a una subclase
     * todas las clase de java son subclase de Object
     * el problema puede psar alreves se decir de superclase a subclase, si la subclase tine mas info que la superclase
     * puede que esa super clase pierda imformacion, tenemos que hacer un cast explicito
     *
     *
     * */

    public void castinsEntreObjetos(){

        Point comp = new Point(7,5);
        SuperClass_Service comp3D = (SuperClass_Service) comp;

        System.out.println("conversion explicita de point a superclase Point3D");

    }

    /*
     * CASTING entre variables primitivas y objetos
     * este no es posbile en java, en general , pero existen classe para cada variable primitiva
     * que nos permiten hacer un  casting que empiezan por mayusculas ya que son clases
     *
     * */

    public void castingVariabeaObjeto(){

        Integer cantidad = new Integer(1245);
        int nuevaCantidad = cantidad.intValue();
    }



    /**
     * Convertir un String en valor numerico
     * uno de los caso mas comunes es obtener un valor objeto String lo que queremos usar en un valor numerico
     * mediante el uso del metodo parseInt() de la clase Integer
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
     * Apartir de java 5 tenemos una nueva funcionalidad Autoboxing y unboxing.
     * que es la conversion automatica entre tipos primitivos y objetos equivalente y viceversa
     * ejemplos
     *
     * Int I = 0;
     * I = new Integer(5); // Auto-unboxing de variabla a Objeto de tipo primitivo int
     *
     *Integer I2 = 5 ; // seria Autoboxing de Objeto a variable equivalente sin el uso de() como casting entre variables y objetos
     * */


}
