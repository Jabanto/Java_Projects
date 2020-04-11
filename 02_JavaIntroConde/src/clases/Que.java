package clases;

/**
 * Created by Jefe Maestro on 14/08/2016.
 */
public class Que {

    int loko ;

    public Que(int loko) {
        this.loko  = loko;
    }

    public void Retorno (){

        System.out.print("cagao" + loko);
    }

    public void comprobar(String respuesta){

        String resultadoStr = "Verde";
        System.out.print("Has respondido que el color es: " + respuesta + "?");
        System.out.println("Respuesta: " + respuesta.equals(resultadoStr));
        int lent = respuesta.length();
        System.out.println(lent);
        System.out.println("----------------------------");

    }

    public void condicional(int notInt){
         if (notInt != loko){
             System.out.println("Tienes un aprobado raspadado");
             System.out.println("----------------");
         } else {
             System.out.println("Tienes un " + loko + " Estas suspendido por bruto XD");
             System.out.println("----------------");
         }
    }



}
