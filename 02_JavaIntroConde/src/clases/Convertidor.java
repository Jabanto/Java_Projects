package clases;

/**
 * Created by Jefe Maestro on 27/09/2016.
 */
public class Convertidor {

    public Convertidor() {
    }

    public void aMayusculas (String[] texto){
        for (int i = 0; i<texto.length;i++){
            texto[i] = texto[i].toUpperCase();
            System.out.print(texto[i]+ " ");
        }
    }

}




