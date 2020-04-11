package com.bhs.rs.pruefungen.Aufgaben;

import com.bhs.rs.pruefungen.Model.Aufgabe;
import com.bhs.rs.pruefungen.Util.AufgabenContext;
import com.bhs.rs.pruefungen.Views.ViewTools;

import java.security.SecureRandom;

/**
 * Created by JAbanto on 30.01.2018.
 */
public class Winter2011_GA1_H2_PGenerator extends Aufgabe {

    private AufgabenContext aufgabenContext;
    private String password;

    public Winter2011_GA1_H2_PGenerator(String context){

        this.aufgabenContext = new AufgabenContext(context);

    }
    @Override
    public void execute() {

        aufgabenContext.getBeschreibung();
        password = null;
        aufgabenContext.doLoop();
        initAufagabe();

    }

    private void initAufagabe() {

        password = passwordGenerator();
        ViewTools.output("Password wurde generiert : " + password);
    }

    private String passwordGenerator() {
        int ziffern = 0;
        int anzahlNummert = 0;
        String password = "";
        char wert ;
        SecureRandom random= null;

        while (anzahlNummert!=2){

            random = new SecureRandom();
            password = "";

            for (int i = 0; i < 7; i++){

                random.nextBytes(new byte[1]);
                double intRandom = random.nextDouble();
                random.setSeed(System.currentTimeMillis());
                /**
                 * wir können direkt von char aus ascii werte bekommen
                 * aber die nur ein Ziffern haben wie zum Beispeil
                 * alle nummer zwischen 33 und 126
                 */
                ziffern = (int)((126-33)*intRandom+33+1);
                if (ziffern >=47 && ziffern <=57){
                    anzahlNummert++;
                }
                wert = (char)ziffern;
                password += String.valueOf(wert);
            }
        }
        return password;
    }

}
