package Replit;

import java.util.Arrays;

public class ReplitCombineToFullName {
    public static String[] combineNames(String[] first_names, String[] last_names) {
        int length = first_names.length + last_names.length;
        String[] combineNames = new String[length-2];

        for (int j = 0; j < combineNames.length; j++) {

            combineNames[j] = first_names[j] + " " + last_names[j];

        }
        return combineNames;
    }

    public static void main(String[] args)
    {
        //feel free to test code here

       String []arr={"Svetlana, Fedorova"};
      
    }
}




/*
Complete the combineNames method to return a new String array that
is composed of the first name and last name of each of the parameters.
This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}
returns a new String array with {"bob jones", "joe smith"}
 */
