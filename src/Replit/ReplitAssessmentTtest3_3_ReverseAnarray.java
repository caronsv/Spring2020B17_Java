package Replit;

import java.util.Arrays;

public class ReplitAssessmentTtest3_3_ReverseAnarray {

    public static void main(String[] args) {
        String[] arr = {"apple", "pear","car", "jackson","computer", "mouse"};
        System.out.println(Arrays.toString(reverse(arr)));



    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {






                String[] arr1 = new String[arr.length];// new Arrays{ str,  str}
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[j];
            j--; }
        arr = arr1;   //  System.out.println(Arrays.toString(arr));
        return arr;

    }
    }
/*
Write the definition of a method reverse, whose parameter is an array of Strings. The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
 */