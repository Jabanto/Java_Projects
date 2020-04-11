package com.bhs.rs.pruefungen.Aufgaben;

import com.bhs.rs.pruefungen.Model.Aufgabe;
import com.bhs.rs.pruefungen.Parsing.XML_work;
import com.bhs.rs.pruefungen.Util.AufgabenContext;
import com.bhs.rs.pruefungen.Util.CurrentDate;
import com.bhs.rs.pruefungen.Views.ViewTools;
import org.w3c.dom.*;

import javax.enterprise.inject.New;
import javax.swing.plaf.ViewportUI;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Calendar;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Winter2015_GA1_H5_Logout extends Aufgabe {

    private XML_work xml_leser= new XML_work();
    private Calendar currentTime;
    private String xmlUserPath;
    private AufgabenContext aufgabenContext;

    public Winter2015_GA1_H5_Logout(String context){

        this.aufgabenContext = new AufgabenContext(context);
    }

    @Override
    public void execute() {
        currentTime = null;
        xmlUserPath = null;
        aufgabenContext.getBeschreibung();
        aufgabenContext.doLoop();
        initAufgabe();
    }

    private void initAufgabe() {
        xmlUserPath = null;
        // TODO: 21.03.2018 Bescreibung bearbeiten Ganze String zerlegen und alle Zeilen bearbeiten
        // beschreibung = beschreibung.replaceAll("(^\\s)|(\\n\\s)","");
        wlan_Zuganskontrolle();
    }

    public void wlan_Zuganskontrolle() {

        xmlUserPath = "src/main/resources/aufgaben/W2015_A1_H5.xml";
        Boolean timeWithoutAction = false;
        String benutzer = "Nutzer";
        Calendar logingTime = Calendar.getInstance();
        while (!timeWithoutAction){
            ViewTools.output("Programm läuft...");
            currentTime = Calendar.getInstance();
            Map<String,Integer> result = CurrentDate.getTimeDiference(currentTime.getTime(),logingTime.getTime());
            for (Map.Entry<String,Integer> entry : result.entrySet()){
                if (entry.getKey().equals("sekunden")){
                    if (entry.getValue()>=10){
                        timeWithoutAction = true;
                        ViewTools.output("10 Sekunden Ohne interaktion, Programm wird beendet");
                        saveUserInfo(benutzer,logingTime,currentTime);
                        logOut();
                        break;
                    }
                }
            }
        }
    }

    private void saveUserInfo(String benutzer, Calendar logingTime, Calendar outLoginTime) {

        Document doc = xml_leser.loadXML(xmlUserPath);

        try {

         //Wir suchen das erste Element von XMl also <users></users>
         Node Users = doc.getFirstChild();

        // Wir definieren hier das Node, das die Element haben wird.
        Element eUser = doc.createElement("user");
        //Dann definieren wir die Attributten des User <user id = 140></user>
        eUser.setAttribute("id","140");
        // dann addieren wir dieses Element auf useren exitierte Element als Node definiert
        Users.appendChild(eUser);

        //Dann adiieren wir die restlichen Elementen in User element
        Element eUserName = doc.createElement("userName");
        // das ist eingentlich was zwischen das Tag komm <userName>Name</userName>
        eUserName.appendChild(doc.createTextNode(benutzer));
        eUser.appendChild(eUserName);

        Element eDatum = doc.createElement("datum");
        // das ist eingentlich was zwischen das Tag komm <datum>Heute</datum>
        eDatum.appendChild(doc.createTextNode(CurrentDate.getDateSQLFormat()));
        eUser.appendChild(eDatum);

        Element eAnmeldung = doc.createElement("anmeldungZeit");
        // das ist eingentlich was zwischen das Tag komm <anmeldungZeit>Gestern</anmeldungZeit>
        eAnmeldung.appendChild(doc.createTextNode(logingTime.getTime().toString()));
        eUser.appendChild(eAnmeldung);

        Element eAbmeldung = doc.createElement("abmeldungZeit");
        // das ist eingentlich was zwischen das Tag komm <abmeldungZeit>Gestern</abmeldungZeit>
        eAbmeldung.appendChild(doc.createTextNode(outLoginTime.getTime().toString()));
        eUser.appendChild(eAbmeldung);

        //benoetigen Klassen um ein XML zu erzeugen

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(xmlUserPath));
            transformer.transform(source,result);
            System.out.println("User Login Information gespeichert...");
            ViewTools.separator();
        } catch (TransformerException e) {
            Logger.getLogger(Winter2015_GA1_H5_Logout.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
        loadUserLog();
    }

    private void loadUserLog() {

        Document doc = xml_leser.loadXML(xmlUserPath);
        NodeList userList = doc.getElementsByTagName("user");
        ViewTools.output("Anzhl Users gefundet ist :" + userList.getLength());

        for (int temp = 0; temp < userList.getLength(); temp++){

            Node nNodeUser = userList.item(temp);
            if (nNodeUser.getNodeType()==Node.ELEMENT_NODE){

                Element element = (Element)nNodeUser;

                System.out.println("\nCoche id: " + element.getAttribute("id"));
                System.out.println("Datum: " + element.getElementsByTagName("datum").item(0).getTextContent());
                System.out.println("User Name: " + element.getElementsByTagName("userName").item(0).getTextContent());
                System.out.println("Anmeldungzeit: " + element.getElementsByTagName("anmeldungZeit").item(0).getTextContent());
                System.out.println("Abmeldungszeit: " + element.getElementsByTagName("abmeldungZeit").item(0).getTextContent());

            }

        }
    }

    private void logOut() {
        ViewTools.output("Nutzer von WLAN abgemeldet...");
    }

}
