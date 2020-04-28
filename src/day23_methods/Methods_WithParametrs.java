package day23_methods;

import java.util.Scanner;

public class Methods_WithParametrs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age=scan.nextByte();

        EligibleToBuyAlcohol((byte)18);
    }

    public static void EligibleToBuyAlcohol(byte age){

        if (age>=21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Eligible to buy milk");

        }

    }
}
