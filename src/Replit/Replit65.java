package Replit;

import java.util.Scanner;

public class Replit65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
    int numOfCharacters=word.length();
    String middle="";
            if(numOfCharacters%2!=0 && numOfCharacters>=5){   //odd
                middle=(numOfCharacters%2!=0 && numOfCharacters>=5) ? middle+=word.substring(numOfCharacters/2-1,numOfCharacters/2+2):
                        "invalid";
                System.out.println(middle);
            }
        System.out.print(middle);
} }

