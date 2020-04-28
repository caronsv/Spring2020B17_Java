package Replit;

import java.util.Scanner;
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true
Example:
input: catcat
output: false
Example:
input: cat-cheetah-dog-cat
output: false
 */
public class Replit86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        for (int i=0; i<word.length()-2; i++){
            if (word.charAt(i)=='c'&& word.charAt(i+1)=='a'&&word.charAt(i+2)=='t'){
                countOfCats++;
            }
            if (word.charAt(i)=='d'&&word.charAt(i+1)=='o'&&word.charAt(i+2)=='g'){
                countOfDogs++;
        }}
        System.out.println(countOfCats==countOfDogs);

    }}

