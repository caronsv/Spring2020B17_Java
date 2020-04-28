package Replit;
import java.util.Scanner;
public class Replit61_Longest {
    /* Write a program that will print out the longest word between two words.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        String result=(word1.length()>word2.length())? word1:word2;
        System.out.print(result);}}