package Replit;

import java.util.Scanner;

public class Replit115 {
    public static void main(String[] args) {Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();
        }

        //write your code below

        String longestName = "";
        int max =0;
        for(int i = 0; i < words.length; i++){

            if( words [i].length() > max){
                max = words[i].length();
                longestName = words[i];
            }
        }
        System.out.println(longestName);
    }
}
/*
Given the array words, it will print the word with the largest length.
Assume that there are no 2 words with longest length
Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */