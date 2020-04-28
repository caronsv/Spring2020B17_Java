package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit102 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            String eachWords = words[i];
            System.out.print(eachWords +"\n"+ " ");

        }
    }
}
