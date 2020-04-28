package Replit;

import java.util.Scanner;

public class Replit62 {
/* Write a program that will print out first and last letters together.
adobe
ae*/
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    String result="";
    result+=""+word.charAt(0)+word.charAt(word.length()-1);
    System.out.print(result); }
}
