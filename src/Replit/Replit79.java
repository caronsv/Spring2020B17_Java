package Replit;

import java.util.Scanner;

public class Replit79 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        String word=txt.substring(0,txt.length()-1);
        System.out.println(word);
    }
}

