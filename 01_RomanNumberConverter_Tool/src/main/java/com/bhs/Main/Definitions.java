package com.bhs.Main;

/**
 * Class with all the definitions list needed to convert numbers
 * @author JefeMaestro
 * @version 1.0.0
 *
 */
public class Definitions {


    private int[] decimalList;

    private String[] romanList;


    public Definitions() {

        decimalList = new int[]{1000,900,500,100,90,50,40,10,9,5,4,1};

        romanList = new String[]{"M","CM","D","C","XC","L","XL","X","IX","V","IV","I"};

    }

    /**
     * Retrieve the value of decimalList
     * @return the list {@code int[]} defined on constructor
     * @see Definitions ()
     */
    public int[] getDecimalList() {
        return decimalList;
    }

    /**
     * Retrieve the value of romanList
     * @return the list {@code String[]} defined on constructor
     * @see Definitions ()
     */
    public String[] getRomanList() {
        return romanList;
    }

    public int returnValueOfRoman(char r){

        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5 ;
        if (r == 'X')
            return 10 ;
        if (r == 'L')
            return 50 ;
        if (r == 'C')
            return 100 ;
        if (r == 'D')
            return 500 ;
        if (r == 'M')
            return 1000 ;

        return -1;
    }



}
