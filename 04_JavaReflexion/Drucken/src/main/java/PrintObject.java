import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 * Created by JAbanto on 20.06.2017.
 */
public class PrintObject implements Printable {


    /**
     * Wr müssen hier das Ganze impritable machen, deshalb implementieren die Klasse Printable
     * dann haben wir ein paar nicht implemetieren ethoden print(), dass den Print Methode die eine Graphic überninmt
     * ein PAge format übernimmt , ein Integer , den Anzahl an Seite
     */


    public int count7(int n) {
        int count = 0;
        int result = n;
        if(n==0){
            return 0;
        }
        if(result/10==7){
            count++;
        }else if (result%10==7){count++;}

        return count + count7(n/10);

    }

        // wir rufen diese Methode für jede Seite.
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        // zuesrst wollen wir göcken, Sind die Seite, die wir aktuell drücken wollen, grösser als 0 ,
        // dann
        if (pageIndex > 0){

            return NO_SUCH_PAGE;
        }

        // wollen wir den Ganzen ein ein Grapisch 2d umwandelt.
        // die Graphic dass wir hier drücken wollen . lasst sich in ein 2 dimensionalen unwandeln.
        Graphics2D graphics2D = (Graphics2D)graphics;
        // un jetzt wollen das Ganze auf unser Page format anpassen,
        graphics2D.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
        // und jetzt wir einfach mal sozusagen unsere Render machen , also jetzt habe  wir alles dass wir brauchen,
        // und jetzt render sozusagen, was wir haben wollen , bzw Hello Word reimprinter


        // und geben der String dass wir haben wollen , so den Anstatt von oben und unten
        graphics2D.drawString("Hello Word", 100, 100);
        // alles in Graphics 2 kann man viele reimscreiben aber als beispielt machen wir ein String, weil
        // 2 dimensionale ist.


        // Dann naturlich müssen wir züruk geben dass wir sozusagen ein erfolgt hatten, also
        // wir haebn unsere Seite gemacht
        return PAGE_EXISTS;

        // Mit retrun null, dann haben wir hier nichts gewonnen
        //return 0;
    }
}
