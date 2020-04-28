package Replit;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class ReplitFirstLast_letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        String result="";
        for (String eachwords:words){
            result=eachwords.substring(0,1)+eachwords.substring(eachwords.length()-1);
            System.out.println(result);

        }


        }
    }

/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne

 */