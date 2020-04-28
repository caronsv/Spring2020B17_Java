package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        //TODO: Write your code below
        for (String eachWord : words) {
            System.out.println(eachWord.substring(0, 1) + eachWord.substring(eachWord.length() - 1));


    }
}}
