package Replit;

import java.util.Scanner;

public class Replit103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");
        //   for (int words)
        String reversed = "";
        for(int i=words.length-1;i>=0;i--){
            reversed+=words[i]+" ";
        }
        reversed=reversed.substring(0,reversed.length()-1);


            System.out.println(reversed);
    }}

