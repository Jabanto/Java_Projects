package com.outcast.javanto.clases;


/**
 * @Autor Javanto
 * Definicion y Usos Basicos de Array en Java
 * No se utiliza criterio basicos para la organizacion ni llamada de los metodos aqui solo se
 * pone practicca conceptos básicos
 */
public class ArrayService {

    // los array son un tipo especial de clases en el que podemos añadir información usando la llamada new

    private int [] rentaPerCapita = new int[10];

    // Para arrays que no son muy largos podemos darles valores directamente al inicializar
    // Si despues de compilar añadimos otro valor , java no nos deja el compilador daria error
    // La posición de [] puede ser antes o despues del nombre de la variable

    private String []marcaImpresotas = {"brother","Cannon","tequila","olivetti"};

    //especicamos el valor del objeto de array que queremos modificar

    private String citaDiaria = "La educacion es algo útil";

    public void  getMarcaImpresotas() {
        String marcas = ("hay " + marcaImpresotas.length + " marcas de impresoras.");
        System.out.println(marcas);
    }

    // los valores numericos tienen un valor inicial de 0
    // los boleanos tiene valor default de false //
    // y los String y objetos tienen valor inicial null

    public void eliminarEspacio(){

        System.out.println("----------------");
        String citaDiaria = "la educacion consiste en enseñar a los hombres no lo que los hombres deben pensar sino a pensar";
        char[] convertir = citaDiaria.toCharArray();
        for (int dex = 0 ;dex < convertir.length;dex++){
            char current = convertir[dex];
            if (current != ' ' ){
                System.out.print(current);
            }
            else {
                System.out.print('.');
            }
        }
        System.out.println("----------------");
    }


}
