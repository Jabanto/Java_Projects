import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

import javax.swing.*;
import java.awt.*;

/**
 * Created by JAbanto on 13.06.2017.
 * wie kann ich Videos in meine einzige APP einbinden
 * dafür brauchen drei wictige Packete SWT, NativesSwing und  NSwing-SWT
 * in unsere Projekt einbinden
 *
 */
public class Main {

    public static void main(String[] args) {


        // Jetzt können wir auf Frenden Code zugreifen

        //wir machen diese Klase auf
        NativeInterface.open();


        // die nächstes dass wir importieren ist diese SwingUtility mit vielen Methoden von Swing
        // new Runnable , heiß das Ding in seine einige Thread läuft
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Java Fenster
                JFrame frame  = new JFrame("Mein youtube Player");
                // Methode
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                // Inhalt von den Frame abgeholt vom getBrowerPanel Methode
                frame.getContentPane().add(getBrowerPanel(), BorderLayout.CENTER);
                // und Konfiguration über den Breite und den Höhe
                frame.setSize(800,600);
                frame.setVisible(true);
            }
        });
        // hier rufen wir die Konfiguration und laufen die APP
        NativeInterface.runEventPump();
        // wenn wir wollen beenden , alles das wir angerufen haben
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                NativeInterface.close();
            }
        }));
    }

    // Hier erstellen wir ein Browser, die wir benutzen können
    public static JPanel getBrowerPanel(){

        JPanel browser = new JPanel(new BorderLayout());
        JWebBrowser jWebBrowser = new JWebBrowser();
        // wo wollen wir un ser Browser anordnet
        browser.add(jWebBrowser, BorderLayout.CENTER);
        jWebBrowser.setBarsVisible(false);


        // mit /embed in the position von w/atch?v= in die Url können
        // wir direct auf fullscreen Modus gehen, eine Video kann man nicht shen normalaweise mit Music

        jWebBrowser.navigate("https://www.youtube.com/embed/H7AyCy3BXYo");

        return browser;
    }


}
