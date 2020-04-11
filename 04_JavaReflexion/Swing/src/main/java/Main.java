import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JefeMaestro on 28.05.2017.
 */
public class Main  extends JFrame{

    /**
     * Java Swing eine Graphische Benutzoberfläche erstellt
     * kann man ein GUi erstelllen , Fenstern anzeige
     * @param args
     */

    public Main(){

        setTitle("Unsere GUI");
        //Auflosung definieren
        setSize(300,200);
        // wir kann man , das setz unsere Fenstern in der Mitte vom Bildschirm anfängt
        setLocationRelativeTo(null);
        // da verwenden ein Macro verwendent
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // wir können nich einiges machen
        // ein Button beibringen zuesrt brauchen wir ein Container

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        // dann addieren wir ein Button

        JButton button = new JButton("Ende");
        button.addActionListener(new ActionListener() {
            // übershreibne diese Methoded
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ende");
                // dan machen wir den Button sichbart
            }
        });
        // hier definieren was de Butoon machen wird er hort immer auf der Button
        // Grup layout hinzufügen in beides Seiten
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(button));
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(button));

        // gibt ein bischenn Platz fürdie Button
        gl.setAutoCreateContainerGaps(true);


    }


    public static void main(String[] args) {

        /**
         * wie man Fenstern erzeugen
         * mti Verwendung von {@link JFrame } Library
         */

        // Dann brauchen wir ein EventQue , das es nicht hangt in verschiedene Situation
        // dann man man hier ein new Runnable reimschreiben
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                // dann erstellen wir ein neues Main
                Main m = new Main();
                // dann machen wir den ganzen visible
                m.setVisible(true);
            }
        });
    }
}
