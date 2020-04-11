package com.bhs.rs.pruefungen.Util;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JAbanto on 15.01.2018.
 * To Obtain current Date with most used Date Format and another methods
 */// TODO: 21.03.2018 Test erstellen 
public final class CurrentDate {


    private static java.util.Date utilDate = new java.util.Date();
    private static Long lnMilisekunden = utilDate.getTime();

    private CurrentDate(){}


    /**
     * Eigentlich brauchen wir nicht diese Class den wird schon in Calender clas alles definiert
     * @return calender Objekt
     */
    public static Calendar getCurrentCalenderDay(){
        Calendar currentDay = Calendar.getInstance();
        currentDay.setTimeInMillis(lnMilisekunden);
        return currentDay;
    }

    /**
     * generate Current Date and
     * @return current Date with from util.Date class
     */
    public static java.util.Date getUtilDate() {
        return utilDate;
    }

    /**
     * Getter date von util.Date class in long format
     * @return
     */
    public static Long getCurrentDateMilisecond() {
        return lnMilisekunden;
    }


    /**
     * 
     * @return aktuell Datum in Format von Klasse util.Date
     */
    public static String getDateUtilFormat(){
        String utilDatum = String.valueOf(utilDate);
        return utilDatum;
    }

    /**
     * 
     * @return aktuell Datum in Format von Klasse sql.Date
     */
    public static String getDateSQLFormat(){
        Date sqlDate =new Date(lnMilisekunden);
        String sqlDatum = String.valueOf(sqlDate);
        return sqlDatum;
    }

    /**
     * 
     * @return aktuell Zeit mit verwendung von util.Date long
     * verwendung von Klasse Time
     */
    public static String getCurrentTime(){
        Time sqlTime = new Time(lnMilisekunden);
        String sqlZeit = String.valueOf(sqlTime);
        return sqlZeit;
    }

    /**
     * 
     * @return aktuell Zeit in Format TimeStamp mit milisekunde dazu
     * Mit Verwendung von long der util.Klase
     */
    // TODO: 21.03.2018 Review ist better mit String variable o better direct ? 
    public static String getCurrentTimeStamp(){
        Timestamp timestamp = new Timestamp(lnMilisekunden);
        String timeStampZeit = String.valueOf(timestamp);
        return timestamp.toString();
    }

    /**
     * um zwei Datum zu vergleichen
     * @param date1
     * @param date2
     * @return ein Map Object mit die Unterschieden von Stunden, Minuten und Sekunde
     */
    public static Map<String,Integer> getTimeDiference(java.util.Date date1, java.util.Date date2){
        java.util.Date oldDate = null;
        java.util.Date youngDate = null;

        Map<String,Integer> resultMap = new HashMap<>();

        /**
         * Wir überprüden welche Datum die Großßer ist
         */
        if (date1.compareTo(date2) > 0){

            oldDate = date1;
            youngDate = date2;
        }else {
            oldDate = date2;
            youngDate = date1;
        }

        //Milisekunden
        long diferenceMili = oldDate.getTime() - youngDate.getTime();

        // wir bekommen die Sekunden
        long sekunden = diferenceMili/1000;

        // wir bekommen die Stunden
        long stunden = sekunden/3600;

        // Minus Stunden um die Minuten zu bekommen
        sekunden = sekunden-stunden*3600;

        //genua wie vorher, wir bekommen Minuten
        long minuten = sekunden/60;
        sekunden =sekunden-minuten*60;

        //dann speichern wir alles in ein Map Object
        resultMap.put("stunden", ((int)stunden));
        resultMap.put("minuten",((int)minuten));
        resultMap.put("sekunden",((int)sekunden));
        return resultMap;
    }

    /**
     * Return the current date
     * @return date of System in format yyyymmdd
     */
    public static String getCurrentDateFormatGerman(){

        Calendar current = new GregorianCalendar();
        java.util.Date currentDate = new java.util.Date();

        SimpleDateFormat simpleDateFormatString = new SimpleDateFormat("yyyyMMdd");

        current.set(Calendar.MILLISECOND,0);
        current.set(Calendar.SECOND,0);
        current.set(Calendar.MINUTE,0);
        current.set(Calendar.HOUR_OF_DAY,0);
        currentDate = current.getTime();
        return simpleDateFormatString.format(currentDate);

    }


}
