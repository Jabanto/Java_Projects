package com.outcast.javanto.clases;

/**
 * @author JefeMaestro
 *
 * Ejemplo basico de llamada a e un metodo desde otra clase,
 * Uso de metodo  basico de la classe String Upper und Lower case
 *
 */
public class StringCase_ConverterService {

    public StringCase_ConverterService() {
    }

    public void aMayusculas (String[] texto){
        for (int i = 0; i<texto.length;i++){
            texto[i] = texto[i].toUpperCase();
            System.out.print(texto[i]+ " ");
        }
    }

    public void aMinusculas (String[] texto){
        for (int i = 0; i<texto.length;i++){
            texto[i] = texto[i].toLowerCase();
            System.out.print(texto[i]+ " ");
        }
    }


}
