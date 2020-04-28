package day14_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.nextLine();

        System.out.println("Enter second word");
        String word2 = input.nextLine();

        System.out.println("Enter third word");
        String word3 = input.nextLine();

        int lenght1 = word1.length();
        int lenght2 = word2.length();
        int lenght3 = word3.length();
        boolean allNotsame = lenght1 != lenght2 && lenght2 == lenght3;

        if (lenght1 == lenght2 && lenght2 == lenght3) ;{
        System.out.println("print all word are the same lenght");

        }
        }

    }

