package com.bhs.rs.pruefungen.Util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CurrentDateTest {

    public Map expectedMap = new HashMap();
    //5:30:00  November 10 - 1950 GMT-05:00
    public Date date1 = new Date(-604070999750L);
    //6:45:20 de November 10 - 1950 GMT-05:00
    Date date2 = new Date(-604066478813L);

    @Test
    public void getTimeDiferenceTestNotNull() {
        Assert.assertNotNull(CurrentDate.getTimeDiference(date1,date2));
    }

    @Test
    public void getTimeDiferenceMapContent(){

        expectedMap.put("stunden",1);
        expectedMap.put("minuten",15);
        expectedMap.put("sekunden",20);
        Assert.assertEquals(expectedMap,CurrentDate.getTimeDiference(date1,date2));
    }

    @Test
    public void getCalenderDay() {
        Calendar calendarExpectec = Calendar.getInstance();
        calendarExpectec.setTimeInMillis(CurrentDate.getCurrentDateMilisecond());
        Assert.assertEquals(calendarExpectec ,CurrentDate.getCurrentCalenderDay());
    }


}