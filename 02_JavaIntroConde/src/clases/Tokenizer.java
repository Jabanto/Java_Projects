package clases;

import java.util.StringTokenizer;

/**
 * Created by Jefe Maestro on 11/09/2016.
 */
public class Tokenizer {

    private StringTokenizer st1 ,st2;
    private String cita1 ;
    public String cita2;

    public Tokenizer() {

    }

    public void tokenTest (){

        System.out.println("-----------------");
        cita2 = "DSGR@9 32/ 25@2/17";
        st1 = new StringTokenizer(cita2);
        System.out.println("token 1 :" +st1.nextToken());
        System.out.println("token 2 :" +st1.nextToken());
        System.out.println("token 3 :" +st1.nextToken());

        // aqui pasamos caracter para separar la arroba en el primer caso no , en le primer caso usa como separacion el esapcio

        st2 = new StringTokenizer(cita2,"@");
        System.out.println("Token 1 :" +st2.nextToken());
        System.out.println("token 2 :" +st2.nextToken());
        System.out.println("token 3 :" +st2.nextToken());
        System.out.println("-----------------");

    }

}
