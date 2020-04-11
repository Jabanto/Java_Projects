import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 * Created by JAbanto on 20.06.2017.
 *  wie kann man ein Drucker einstellen kann, bzw ein Druckauftrag im Autrgg geben kann
 *
 *
 */
public class Main {



    public static void main(String[] args) {

        /**
         * wir brauchen ein sogenante printer Job dass sozurdagen der Drucker , der gerade den Job macht, also den
         * Printjob kann man aus der Klasse Printer Job als static Varaible hier raus kriegen. wie wir hier sehen könne
         *
         */






        PrinterJob printerJob = PrinterJob.getPrinterJob();


        printerJob.setPrintable(new PrintObject());

        if (printerJob.printDialog()){

            try {
                printerJob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }

    }


}
