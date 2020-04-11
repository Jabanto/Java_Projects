
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by JAbanto on 26.09.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int[] meineArr = {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9};

        System.out.println(xyzThere("xyz.abc"));
        System.out.println(xyzThere("12xyz"));

    }


    public static boolean xyzThere(String str) {
        int i = str.length();
        String temp = "";
        char comprobationChar;
        if(i>2){

            for(int k=0;k+3<=i;k++){

                temp = str.substring(k,k+3);
                if(temp.equals("xyz")){

                    if (k>0) {
                        comprobationChar = str.charAt(k - 1);
                        if(Character.isLetter(comprobationChar)||Character.isDigit(comprobationChar)){
                            return true;
                        }
                    }else {
                        return true;
                    }

                }

            }
        }

        return false;


    }


    public static String sameEnds2(String string)
    {
        String temp,last;
        int p = string.length();
        int i;
        if(p%2 == 1)
        {
            i = p/2;
            p = i + 1;
        }
        else
        {
            i = p/2;
            p = i;
        }
        for(; i >= 1; i--, p++)
        {
            temp = string.substring(0, i);
            last = string.substring(p);
            if(temp.equals(last))
                return temp;
        }
        return "";
    }



    public static String plusOut(String str, String word) {

        int len = str.length();
        int wLen = word.length();
        int pos = str.indexOf(word);
        int i = 0;
        StringBuilder stbuild = new StringBuilder(len);
        while(pos != -1)
        {
            while(i < pos)
            {
                stbuild.append('+');
                i++;
            }
            stbuild.append(word);
            i = pos + wLen;
            pos = str.indexOf(word, i);
        }
        for(i=i; i < len; i++)
            stbuild.append('+');

        return stbuild.toString();
    }

    public static String notReplace(String str) {

        int index = str.indexOf("is");
        char character1,character2;
        while(index != -1){

            if(index == 0){
                str = returnString(index,str);
            }else if(index>0){

                character1=str.charAt(index-1);

                if(!Character.isLetter(character1)){

                    if(index+2<str.length()){

                        character2=str.charAt(index+2);
                        if(!Character.isLetter(character2)){
                            str = str.substring(0, index + 2) + " not" + str.substring(index + 2);
                        }

                    }else{
                        str = str.substring(0,index+2) + " not"+str.substring(index+2);
                    }

                }

            }
            index = str.indexOf("is",index+2);

        }

        return str;
    }

    public static String returnString(int index, String str){

        char character2;

        if(index+2<str.length()) {
            character2 = str.charAt(index + 2);
            if (!Character.isLetter(character2)) {
                str = str.substring(0, index + 2) + " not" + str.substring(index + 2);
            }
        }else {
            str = str.substring(0, index + 2) + " not" + str.substring(index + 2);
        }

        return str;
    }

    public static int sumNumbers(String str) {
        Integer result = 0;
        String number = "0";
        List<Integer> numbers = new ArrayList();
        char[] array = str.toCharArray();


        for(char character: array){

            if(Character.isDigit(character)){
                number = number + character;
            }else{
                numbers.add(Integer.parseInt(number));
                number="0";
            }

        }
        if (Integer.parseInt(number)!=0){
            numbers.add(Integer.parseInt(number));
        }

        for(Integer numberFinded : numbers){
            result = result + numberFinded;
        }

        return result;

    }

    public static int maxBlock(String str) {

        int maxLength = 0;
        int currentLength =0;
        String block = "";

        for(int i = 0 ; i < str.length()-1 ;i++){

            if(str.charAt(i)==str.charAt(i+1)){
                block = block + str.charAt(i)+str.charAt(i+1);
                currentLength = block.length();
            }else{
                block = "";
            }

            if(currentLength>maxLength){
                maxLength=currentLength;
            }
        }

        return maxLength;
    }

    public static String mirrorEnds(String string) {

        String result = "";
        String captureStart="";
        String captureEnd = "";
        int length = string.length();

        for (int i = 0; i < string.length() ; i++){

            if(i != length){
                captureStart=string.substring(i,i+1);
                captureEnd=string.substring(length-1,length);
                if (captureStart.equals(captureEnd)){
                    result = result+captureStart;
                }else {
                    break;
                }
            }else {
                break;
            }
            length--;

        }

        return result;
    }

    public static int sumDigits(String str) {
        int sum=0;
        if(!str.matches(".*[a-zA-Z_0-9].*")){
            return sum = 0;
        }

        char capture;

        for(int i = 0 ; i < str.length();i++){

            capture=str.charAt(i);
            if(Character.isDigit(capture)){
                int number = (int)(capture-48);
                sum +=number;
            }


        }

        return sum;
    }



    public static boolean gHappy(String str) {

        boolean happy = false;
        if(str.equals("")){
            return happy=true;
        }

        for(int i = 0; i+1 <= str.length(); i++){

            String capture = str.substring(i,i+1).toLowerCase();

            if(i > 0 && capture.equals("g")){
                if(str.charAt(i-1)=='g'){
                    happy=true;
                    i++;
                }else if (i+1 != str.length()&&str.charAt(i+1)=='g'){
                    happy=true;
                    i++;
                }else{
                    happy=false;
                }
            }else if (capture.equals("g")){
                if(i+1==str.length()){
                    happy=true;
                } else if(str.charAt(i+1)=='g'){
                    happy=true;
                    i++;
                }
            }

        }
        return happy;

    }


    public static String withoutString(String base, String remove) {

        String result="";

        if(remove.length()>0){

            String capture = "";
            for(int i = 0 ; i+remove.length()-1 < base.length()||i == base.length()-1 ; i++){

                if(i==base.length()-1){
                    result += base.substring(i);
                    break;
                }
                capture=base.substring(i,i+remove.length()).toLowerCase();

                if(!capture.equals(remove.toLowerCase())){
                    if(i+remove.length()==base.length()){
                        result = result + capture;
                    }else{
                        result = result + base.substring(i,i+1);
                    }

                }else{
                    i=i+remove.length()-1;
                }

            }

        }

        return result;

    }




    public static String replace(String str){

        str.replaceAll("ye"," ");
        return str;
    }

    public static int countYZ(String str) {
        int count = 0;
        String letter = "";
        int length = str.length();

        for(int i = 0 ; i < str.length() ;i++ ){

            letter=str.substring(i,i+1).toLowerCase();
            if(letter.equals("z")||letter.equals("y")){
                if(i+1<=str.length()){

                    if(i+1==str.length()){
                        count++;
                    }else{
                        char follow = str.charAt(i+1);
                        if(!Character.isLetter(follow)){
                            count++;
                        }
                    }

                }
            }

        }

        return count;
    }


    public static int seriesUp(int[] nums) {
        int currentLength = 0;
        int lastLength = 0;
        int lastPosition=nums.length-1;
        for(int i = 0 ; i < nums.length;i++){
            for(int j = lastPosition ; j >= i ; j--){
                if (j-i < lastLength && j!=i){
                    return lastLength;
                }
                if(nums[i]==nums[j]){
                    if (currentLength==0&&i==j)break;
                    if(i==j && currentLength==1){
                        currentLength = currentLength+2;
                        return currentLength;
                    }
                    currentLength = currentLength+1;
                    if(currentLength>lastLength){
                        lastLength=currentLength;
                    }
                    lastPosition=j-1;
                    break;
                }else if (currentLength>0){
                    j=nums.length;
                    currentLength=0;
                }


            }
        }
        return lastLength;
        }



    public static boolean doubleX(String str) {

        int i = str.indexOf("x");
        String capture = "";

        if(i !=-1 && i+2 < str.length()){

            capture=str.substring(i,i+2);
            if(capture.equals("xx")){
                return true;
            }

        }



        return false;

    }





    public static int maxMirror(int[] nums) {

        int iterator = 0;
        int lengthValue = 0;
        int currentValue = 0;
        int mirrorValue = 0;
        // find group of contiguous elements
        for (int i = 0; i < nums.length; i++) {

            currentValue = nums[i];
        for (int j = nums.length - 1; j >= i; j--) {

                mirrorValue = nums[j];
                if (currentValue == mirrorValue && i + 1 < nums.length) {
                    lengthValue++;
                    iterator = i+1;
                    currentValue = nums[iterator];
                }else if (lengthValue != 0 && currentValue != mirrorValue ) {
                    if(j-iterator<= lengthValue || j == i){
                        return lengthValue;
                    }
                    iterator = i;
                    lengthValue = lengthValue-lengthValue;
                    break;
                }


            }

        }
        return lengthValue;
    }

    public static String[] fizzBuzz(int start, int end) {

        // Create array with end-Start length
        String[] newListe = new String[end-start];
        int currentValue = 0;
        // replace with series of numbers start and running up to but not including end
        for (int i = 0 ; i < newListe.length; i++){

            currentValue = i+1;
            // for multiples of both 3 and 5 use "FizzBuzz"
            if (currentValue % 3 == 0 && i+1 % 5 == 0){
                newListe[i] = "FizzBuzz";
            }
            // multiples of 3, use "Fizz" instead  of the number
            else if(currentValue % 3 == 0){
                newListe[i] = "Fizz";
            }
            // multiples of 5, use "Buzz" instead  of the number
            else if(currentValue % 5 == 0){
                newListe[i] = "Buzz";
            }
            else{
                newListe[i] = String.valueOf(currentValue);
            }
            // containing the string form of these numbers

        }

        return newListe;

    }




    public static int[] zeroMax(int[] nums) {

        int capture = 0;
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(i+1 < nums.length){
                if(nums[i]==0){
                    if(nums[i+1]%2 != 0 ){
                        //capture=nums[i+1];
                        if(nums[i+1]>capture){
                            capture=nums[i+1];
                        }
                        count++;
                    }
                }
            }
        }

        for(int j = 0 ; j < count ; j++){

            if(nums[j]== 0){
                nums[j]=capture;
            }

        }
        return nums;
    }



    public static int[] evenOdd(int[] nums) {

        int captureEven = 0;
        int captureOdd = 0;
        int position = 0;
        for (int number : nums) {

            if (number % 2 == 0) {
                captureEven = number;
                position++;
            }
            captureOdd = number;
        }
        for (int i = 0; i < nums.length; i++) {

            if (i < position) {
                nums[i] = captureEven;
            }
            if (i >= position) {
                nums[i] = captureOdd;
            }

        }

        return nums;
    }

    public static boolean tripleUp(int[] nums) {

        boolean result = false;
        int secondValue = 0;
        int count = 0;
        int i = 0;
        for(int number : nums){

            if(i+1 < nums.length){

                if(count > 0 && secondValue !=0 & nums[i+1] - secondValue !=1){
                    count = 0;
                    secondValue = 0;
                }
                if(secondValue == 0 && nums[i+1] - number ==1 ){
                    count ++;
                    secondValue = nums[i+1];
                }
                if(count > 0 && secondValue != 0 && nums[i+1] - secondValue == 1){
                    count++;
                }

            }

            if(count > 1 && number - secondValue == 1){
                count++;
            }
            i++;
        }
        if(count ==3){
            result = true;
        }
        return result;

    }

    public static boolean tripleUp2(int[] nums) {
        for (int i = nums.length-1; i>1; i--) {
            if ((nums[i]+nums[i-2])/2 == nums[i-1]) {
                return true;
            }
        }
        return false;

    }

    public static boolean sameEnds(int[] nums, int len) {

        boolean result = false;
        int countFounded = 0;

        for(int i = 0 ; i < len  ; i++){

            if(nums[i] == nums[nums.length-(len-i)]){
                countFounded ++ ;
            }

        }
        if(countFounded > 0){
            result = true;
        }
        return result;
    }


    public static boolean haveThree(int[] nums) {

        boolean result = false;
        int count = 0;

        for(int i = 0; i < nums.length ; i++){
            if(i+1 < nums.length && nums[i]==3 && nums[i+1]!=3 && count !=3){
                count++;
            }
            if(i+1 <nums.length && count>1 && nums[i+1]==3){
                count++;
            }
        }
        if(count>=3){
            result = true;
        }

        return result;
    }


    public static boolean modThree(int[] nums) {

        boolean result = false;
        int countOdd = 0;
        int countEven = 0;

        for(int number : nums){
            if(number % 2 ==0){

                countOdd++;
                countEven=0;
            }

            if(number % 2 != 0){
                countEven++;
                countOdd = 0;
            }

        }
        if(countEven > 2 || countOdd > 2){
            result = true;
        }
        return result;
    }





    public static String[] fizzArray2(int n) {

        String[] returnArray = new String[n];
        String valueOfArray = "";

        for(int i = 0 ; i < returnArray.length ; i++){

            returnArray[i] = Integer.toString(i);

        }

        return returnArray;

    }






    public static boolean only14(int[] nums) {

        boolean oneOr4 = true;
        // return true if every element is a 1 or a 4.
        int capture4 = 0;
        int capture1 = 0;

        for(int number:nums){

            if(number == 1 ){

                capture1=number;
            }
            if(number == 4 ){
                capture4 = number;
            }

        }

        if (capture1 != 0 && capture4 !=0){

            return false;
        }
        return oneOr4;
    }

    public static String fromArabToRoman(int arabNumber){

        String romanNumber = "";

        return romanNumber;
    }

    public static int fromRomanToArab(String romanNumber){

        int arabNumber= 0;

        return arabNumber;
    }



    public boolean compare (String small , String big){

        if (small.length() != big.length()) {

            String character = big.substring(big.length() - small.length());

            if (small.toLowerCase().equals(character.toLowerCase())) {
                return true;
            }

        }

        return false;

    }



}
