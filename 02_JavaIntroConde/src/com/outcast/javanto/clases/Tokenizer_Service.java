package com.outcast.javanto.clases;

import java.util.StringTokenizer;

/**
 * @author JefeMaestro
 * @Created  on 2016
 * Uso básico del String tokenizer para dividir un String en tokens o substrings mucho mas sencillo
 * que le utilizado en StreanTokenizer
 *
 */
public class Tokenizer_Service {

    private StringTokenizer st1 ,st2;
    private String cita1 ;
    public String cita2;

    public Tokenizer_Service() {

    }

    public void tokenTest (){

        System.out.println("-----------------");
        cita2 = "DSGR@9 32/ 25@2/17";
        st1 = new StringTokenizer(cita2);
        // con next vamos sacando los tokens en que se ha dividi el string st1 por defecto se van separar por espacio en blanco
        System.out.println("token 1 :" +st1.nextToken());
        System.out.println("token 2 :" +st1.nextToken());
        System.out.println("token 3 :" +st1.nextToken());

        // aqui pasamos caracter para separar la arroba en el primer caso no , en el primer caso usa
        //como separacion el espacio
        st2 = new StringTokenizer(cita2,"@");
        System.out.println("Token 1 :" +st2.nextToken());
        System.out.println("token 2 :" +st2.nextToken());
        System.out.println("token 3 :" +st2.nextToken());
        System.out.println("-----------------");
    }



}
