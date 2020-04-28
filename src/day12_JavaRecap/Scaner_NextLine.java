package day12_JavaRecap;

import java.util.Scanner;

public class Scaner_NextLine {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter some number");
        int num=input.nextInt();
        System.out.println(num);

        input.nextLine();



        System.out.println("Enter your name");
        String name = input.nextLine();


    }
}
