package Replit;

import java.util.Scanner;

public class Replit67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reverse="";
        int maxIndex=word.length()-1;
        if(word.length()<5){
            reverse="Too short!";
        }else if(word.length()>5){
            reverse="Too long!";
        }else{
            for (int i=maxIndex; i>=0; i-=1){
                reverse+=""+word.charAt(i);
            }
        }
        System.out.print(reverse);}}