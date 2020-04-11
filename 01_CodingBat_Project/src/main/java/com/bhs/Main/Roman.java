package com.bhs.Main;

/**
 * Created by JAbanto on 06.10.2017.
 */
public class Roman {


    private int[] decimalList;

    private String[] romanList;


    public Roman() {

        decimalList = new int[]{1000,900,500,100,90,50,40,10,9,5,4,1};

        romanList = new String[]{"M","CM","D","C","XC","L","XL","X","IX","V","IV","I"};

    }


    public int[] getDecimalList() {
        return decimalList;
    }

    public String[] getRomanList() {
        return romanList;
    }




}
