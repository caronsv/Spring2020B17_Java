package Replit;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        String firstName, lastName;
        Scanner input = new Scanner(System.in);

        //Get input String
        firstName = input.nextLine();
        System.out.println(firstName);
        lastName=input.nextLine();
        System.out.println(lastName);
    }
}
