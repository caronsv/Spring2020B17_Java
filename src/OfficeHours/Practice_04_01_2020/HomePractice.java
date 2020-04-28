package OfficeHours.Practice_04_01_2020;

import java.util.Scanner;

public class HomePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = input.nextLine();

        if(text.length()>0) {
            System.out.println("String is not empty and length is: "+text.length());
        }
        text = "";
        if(text.length()==0) {
            System.out.println("String is empty now: "+text.length());
        }

        /*         012345678910
        //last index number = length-1

        String word1 = sentence1.substring(7, sentence1.length()); // "Java"
        String word2 = sentence1.substring(2, 6);
        // "likeJava"
        String word3 = sentence1.substring(2, 6) + sentence1.substring(7, sentence1.length());

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);*/

    }


}
