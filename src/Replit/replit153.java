package Replit;

import java.util.Scanner;

public class replit153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        for(String each2: words){
            int count = 0 ;
            for(String each   :  words){
                if(each.equals(each2)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(each2);
            }



        }

         }


        }



/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */