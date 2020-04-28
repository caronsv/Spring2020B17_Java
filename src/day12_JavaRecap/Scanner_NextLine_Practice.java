package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Builder Number");
        int Bnumber=input.nextInt();

        System.out.println("Builder number is: "+Bnumber);
        System.out.println("Street");
        String street=input.nextLine();

        System.out.println("Street is :n"+ street);
        System.out.println("Enterthe zipcode: ");
        int zipcode=input.nextInt();

        input.nextLine();
        System.out.println("enter the city name and state seperated by comma and space");
        String fullAdress=Bnumber+" "+street+", ";
    }


    }

