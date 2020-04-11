package clases;

import java.time.Year;
import java.util.Calendar;

/**
 * Created by Jefe Maestro on 17/08/2016.
 */
public class Calender {


    Calendar ahora = Calendar.getInstance();
    int hora = ahora.get(Calendar.HOUR_OF_DAY);
    int minuto = ahora.get(Calendar.MINUTE);
    int mes = ahora.get(Calendar.MONTH) + 1;
    int dia = ahora.get(Calendar.DAY_OF_MONTH);
    int an = ahora.get(Calendar.YEAR);

    public void mostrarSaludo(){
        if ( hora < 12){
            System.out.println("Buenos dias.");
        }else if (hora < 17){
            System.out.println("Buenas Tardes");
        }else {
            System.out.println("Buenas Noches");
        }

        //Mostrar la hora

        System.out.print("Son las");
        System.out.print(" ");
        System.out.print((hora > 12)? (hora - 12) : hora);
        System.out.print(" horas ");

        if (minuto !=0) {
            System.out.print(minuto + " ");
            System.out.print((minuto !=1)? "minutos " : "minuto ");
        }

        //mostrar el dia
        System.out.println("del dia " + dia + " de ");

        //mostrar el nombre del mes
        switch (mes){
            case 1:
                System.out.print("Enero");
                break;
            case 2:
                System.out.print("Febrero");
                break;
            case 3:
                System.out.print("Marzo");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("Mayo");
                break;
            case 6:
                System.out.print("Junio");
                break;
            case 7:
                System.out.print("Julio");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Septiembre");
                break;
            case 10:
                System.out.print("Oktubre");
                break;
            case 11:
                System.out.print("Noviembre");
                break;
            case 12:
                System.out.print("Diciembre");
                break;
        }
        //mostrar año
        System.out.println(" de " + an + ".");
    }

    //
}
