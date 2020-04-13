package com.bhs.Main;

/**
 * Class with all the definitions list needed to convert numbers
 * @author JefeMaestro
 * @version 1.0.0
 *
 * TODO rename Roman class to Definitions
 */
public class Roman {


    private int[] decimalList;

    private String[] romanList;


    public Roman() {

        decimalList = new int[]{1000,900,500,100,90,50,40,10,9,5,4,1};

        romanList = new String[]{"M","CM","D","C","XC","L","XL","X","IX","V","IV","I"};

    }

    /**
     * Retrieve the value of decimalList
     * @return the list {@code int[]} defined on constructor
     * @see Roman()
     */
    public int[] getDecimalList() {
        return decimalList;
    }

    /**
     * Retrieve the value of romanList
     * @return the list {@code String[]} defined on constructor
     * @see Roman()
     */
    public String[] getRomanList() {
        return romanList;
    }

}
