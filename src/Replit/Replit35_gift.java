package Replit;

import java.util.Scanner;

public class Replit35_gift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int giftCard=100;

        int cashAmount;
        switch (item) {
            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;

            case "Charger":
                System.out.println("Thank you for your purchase!");
                cashAmount = giftCard - 15;
                System.out.println("Your current balance is: " + cashAmount + "$");
                break;
            case "USB cable":
                System.out.println("Thank you for your purchase!");
                cashAmount = giftCard - 10;
                System.out.println("Your current balance is: " + cashAmount + "$");
                break;
            case "Headphones":
                System.out.println("Thank you for your purchase!");
                cashAmount = giftCard - 30;
                System.out.println("Your current balance is: " + cashAmount + "$");
                break;
            case "Pants":
                System.out.println("Thank you for your purchase!");
                cashAmount = giftCard - 50;
                System.out.println("Your current balance is: " + cashAmount + "$");
                break;
            case "Hat":
                System.out.println("Thank you for your purchase!");
                cashAmount = giftCard - 25;
                System.out.println("Your current balance is: " + cashAmount + "$");
                break;
            case "Socks":
                System.out.println("Thank you for your purchase!");
                cashAmount = giftCard - 5;
                System.out.println("Your current balance is: " + cashAmount + "$");
                break;
            case "Blanket":
                System.out.println("Thank you for your purchase!");
                cashAmount = giftCard - 60;
                System.out.println("Your current balance is: " + cashAmount + "$");
                break;
            case "Pillow":
                System.out.println("Thank you for your purchase!");
                cashAmount = giftCard - 40;
                System.out.println("Your current balance is: " + cashAmount + "$");
                break;
            default:
                System.out.println("invalid item!");
        }

    }
    }

