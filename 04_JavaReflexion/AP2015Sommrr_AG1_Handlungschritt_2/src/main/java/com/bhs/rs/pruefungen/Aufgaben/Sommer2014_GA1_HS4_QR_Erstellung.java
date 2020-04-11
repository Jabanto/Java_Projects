package com.bhs.rs.pruefungen.Aufgaben;

import com.bhs.rs.pruefungen.Model.Aufgabe;
import com.bhs.rs.pruefungen.Util.AufgabenContext;
import com.bhs.rs.pruefungen.Views.ViewTools;

import java.io.UnsupportedEncodingException;

public class Sommer2014_GA1_HS4_QR_Erstellung extends Aufgabe {

    private AufgabenContext context ;

    public Sommer2014_GA1_HS4_QR_Erstellung(String context){
        this.context = new AufgabenContext(context);
    }

    @Override
    public void execute() {
        context.getBeschreibung();
        //context.doLoop();
        initAufgabe();
    }

    private void initAufgabe() {

        String werbetext = "Gunstig";
        qrErstellen(werbetext);

    }

    private void qrErstellen(String werbetext) {

        String s = null;
        try {

            byte[] latin1 = werbetext.getBytes("ISO-8859-1");
            s = new String(latin1,"utf-8");
        }catch (UnsupportedEncodingException uue){
            uue.printStackTrace();
        }
        ViewTools.output(s);
    }
}
