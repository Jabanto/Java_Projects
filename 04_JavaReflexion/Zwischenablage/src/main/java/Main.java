import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * Created by JAbanto on 19.06.2017.
 */
public class Main {

    /**
     * diese coolen Button , die Datei auslesen und unterladen kann.
     * @param args , wie lesen die Zwischenablage aus und bzw schreiben noch wieder was reim
     */

    public static void main(String[] args) {


        // laden wir hier mal, das einfach nur , das wir nicht so viel screiben müssen, ihh musste quasi einmal ein           riesen Code auswerten

        Clipboard systemClip = Toolkit.getDefaultToolkit().getSystemClipboard();

        /**
         * 2 wie können auch neu Inhalt von unsere Zwischenablage schreiben und k
         * wenn wir das deaktivieren werden wir in den Zwishcne balage speichern was wir seletec haben.
         * und können dann diese Information oder Content verwenden o der vo wir wollen kopieren
         *
         * ownel kann man aug null setzen , di andere teil wäare die contentn von den Zwischen abalge , mit
         * Stringselection
         *
         */

        systemClip.setContents( new StringSelection("ich bin den Zwischenablage"),null);



        // und dann von diesem Systemclip krallen (nehmen) wir uns den Transferable, und dann haben wir hier unsere
        // Systen clip . get content von null , das liefert uns quasi des von Zwischenablage , jetzt ist der
        // Transfarable  quasi unsere Zwichenablage, so greifen wir darauf zu , diese Systemclip ist nur eine
        // Abkurzung ansonstens sollen wir
        // Toolkit ... schreiben
        Transferable transferable = systemClip.getContents(null);


        /**
         * wir iterieren einfach mal durch , wo i kleiner als , wir greifen auf Transfert punkt , get ..
         * das sind quasi die Sachen, die in unsere Zwischenablage stehen. und das ganze ist ein Array , keien Liste
         * deshlab mussen über .lenght zugreifen, so sagen wir hier
         */

        for (int i = 0; i < transferable.getTransferDataFlavors().length; i++) {

            // alle oberste Klasse dass überhaup gibst
            Object content = null;

            try {

                // wir greifen auf Transferable punkt transafr data und data Flavors is was wir oben haben,
                // ist das quai
                // Array aus Data flavors und hier schreiben wir hier , Transferable. get Transferdata und wir
                // müssen hier aber noch mal eingeben, soll den ganzen ist jetzt ein Object
                //

                content = transferable.getTransferData(transferable.getTransferDataFlavors()[i]);
            } catch (UnsupportedFlavorException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Wenn diese Object/Content ,dass ich kopiert habe , ein String ist dann printen wir den

            if (content instanceof String) {

                System.out.println(content);
                // dann break wir noch und so liest man den Zwischenablage aus

                break;
                // und so liest man quasi die Zwichenablager aus.

            }

        }

    }

}
