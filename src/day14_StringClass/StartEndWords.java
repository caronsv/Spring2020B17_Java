package day14_StringClass;

import java.util.Scanner;

public class StartEndWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.nextLine();

        System.out.println("Enter second word");
        String word2 = input.nextLine();

        int lenth1 = word1.length();
        int lenth2 = word2.length();

        if (lenth1 == 5 && lenth2 == 5) {

            if (word2.charAt(lenth2 - 1) == word2.charAt(0)) {
                System.out.println("Fizz");
            } else {
                System.out.println("buzz");
            }

        }else{
            System.out.println("need to be exactly 5 chars length");



            }

        }
    }


