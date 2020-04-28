package Replit;

import java.util.Scanner;

/*
Instructions from your teacher:
In this task, you need to swap the first name with the last name in the email.
If the email doesn't contain underscore - do not do anything.
Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
 */
public class Replit72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if (email.contains("_")) {
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String firstName = email.substring(0, email.indexOf("_"));
            String domain = email.substring(email.indexOf("@") + 1);
            System.out.println(lastName + "_" + firstName + "@" + domain);
        } else{
            System.out.println(email);
        }
    }

    }
