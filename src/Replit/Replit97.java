package Replit;

import java.util.Scanner;

public class Replit97 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava=0;
        int countPython=0;
        while (sentence.contains("java")||sentence.contains("python")){
            if (sentence.contains("java")){
                sentence=sentence.replaceFirst("java", " ");
                countJava++;
            }
            if (sentence.contains("python")){
                sentence=sentence.replaceFirst("python"," ");
                countPython++;
            }}
        if (countJava==countPython){
            System.out.println(true);
        }else {
            System.out.println(false);
        }}}




/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number
 of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */