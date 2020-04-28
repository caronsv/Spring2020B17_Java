package Replit;

import java.util.Scanner;

public class Replit75 {
    public static void main(String[] args) {
//        Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.
//        Example:
//        input: xHiX
//        output: Hi
//        Example:
//        input: apple
//        output: apple
//        input: xUxL
//        output: UxL
//        input: JavaX
//        output: Java
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        boolean wordstart =word.startsWith("X")||word.startsWith("x");
        boolean wordend = word.endsWith("x")||word.endsWith("X");
        if (wordstart||wordend){
            System.out.println(word.replace("x","").replace("X","")); }
        else {
            System.out.println(word);
     }
        }}