package day25_MethodRecap;

import Resources.Library;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="AABBCC";//A2B2C2
        String NonDup=Library.RemoveDuplicates(str);
        String result="";//ABC

        for (int i=0;i<NonDup.length();i++){
           String ch=""+NonDup.charAt(i);  // "A"
           int num= Library.Frequency(str,ch);
            result+=ch+num;
    }
        System.out.println(result);
    }

    public static String FrequencyOfChars(String str) {
        String NonDup =  Library.RemoveDuplicates(str)  ;             //ABC
        String result = ""; //coantisn the frequency of chars

        for(int i =0; i < NonDup.length();i++){
            String ch = ""+NonDup.charAt(i);//  "A"
            int num =  Library.Frequency(str, ch);
            result += ch+num;
        }

        return result;
        }
    }
/*
Create a method that gets an array of strings and a string, the method returns an int.

It counts how many times a string appears in the array and returns the count.
for example (pseudo code):
some_array = ["a","foo","bar","foo","bla"]
some_string = "foo"
count_appearance(some_array ,some_string )
will return 2 because some_array  has 2 appearances of "foo" string.
 */