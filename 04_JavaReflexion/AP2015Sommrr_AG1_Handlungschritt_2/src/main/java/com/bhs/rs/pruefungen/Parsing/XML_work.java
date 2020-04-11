package com.bhs.rs.pruefungen.Parsing;

import com.bhs.rs.pruefungen.Views.ViewTools;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * XML Parser Class to extract info from XML with DOM Libreries
 */
public class XML_work {

    private String xmlPath;
    private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    public XML_work(){
        xmlPath = "src/main/resources/content/Aufgaben_Beschreibung.xml";
    }

    public XML_work(String xmlPath){
        this.xmlPath= xmlPath;
    }

    public void  createXMLFile(String aufgabeCode){
        String localPath = aufgabeCode + ".xml";
        File xmlFile = new File(localPath);
        ViewTools.output("xml File Created in :" + localPath);
    }

    /**
     * Addiert ein neue user in XMl file
     */
    // TODO: 22.03.2018 XMl datei aufladen mit DOM mit XPath oder String ?
    public Document loadXML(String xmlPath){

        String path = xmlPath;
         DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder documentBuilder;
          Document  doc = null;

         //Laden wir die Daten durch Filepath
        try {
            documentBuilder = docFactory.newDocumentBuilder();
            doc = documentBuilder.parse(path);
        } catch (SAXException | IOException |ParserConfigurationException e ) {
            Logger.getLogger(XML_work.class.getName()).log(Level.SEVERE,null,e);
            e.printStackTrace();
        }

        return doc;
    }

    public String getDescriptionByID(String aufgabeId){

        String description = null;
       factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document document = null;

        try {
            builder = factory.newDocumentBuilder();
            document = builder.parse(xmlPath);
            /**
             * Create XPATHFactory object
             * and Create XPath object
             */
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xPath = xPathFactory.newXPath();
            description = getExerciceDescription(aufgabeId, document, xPath);

        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }

        return description;
    }

    private String getExerciceDescription(String aufgabeId, Document document, XPath xPath) {

        String description = null;

        XPathExpression expression = null;
        try {
            expression = xPath.compile(String.format("/aufgaben/aufgabe[@id='%s']/aufgabeBeschreibung/text()", aufgabeId));
            description = (String)expression.evaluate(document,XPathConstants.STRING);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        return description;
    }

}
