package clases;
import java.lang.String;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by Jefe Maestro on 23/08/2016.
 */
public class Array {

    // los array son un tipo especial de clases por eso podemos añadir inforacion usando new

     private int [] rentaPerCapita = new int[10];

    // para array no muy largos podemos darles valores directamente
    //si despues de compilar añadimos otro valor , java no nos deja el compilador daria error
    // la posicion de [] puede ser antes o despues del nombre de la variable

    private String []marcaImpresotas = {"brother","Cannon","tequila","olivetti"};

    //especicamos el valor del objeto de array que queremos modificar


    private String citaDiaria = "La educaci";

    public void  getMarcaImpresotas() {
        String marcas = ("hay " + marcaImpresotas.length + " marcas de impresoras.");
        System.out.println(marcas);
    }

    // los valores numericos tiene valor inicilas de 0
    // los boleanos tiene valor false //
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
