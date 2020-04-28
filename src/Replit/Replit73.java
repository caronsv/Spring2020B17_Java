package Replit;

import java.util.Scanner;
/*
Write a program that will print out information about the user based on email.
Print first and last name from the email with the upper case.
(Assume that first and last names were separated by an underscore)
Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com */
public class Replit73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
String firstName=email.substring(0,email.indexOf("_"));
String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
String  domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
String  TLdomain=email.substring(email.indexOf(".")+1);
        System.out.println("First name: "+firstName.substring(0,1).toUpperCase()+firstName.substring(1));
        System.out.println("Last name: "+lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+TLdomain);


    }
}
