package Replit;

import java.util.Scanner;

/*
Write a program that assigns freeBooks the appropriate value based on the values of the boolean variable
isPremiumCustomer and the int variable nbooksPurchased. Print amount of freeBooks into the console.
 */
public class Replit80 {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
        nbooksPurchased = 0;
        if (isPremiumCustomer) {
            if (nbooksPurchased >= 5 && nbooksPurchased < 8) {
                freeBooks+=1;
            } else if (nbooksPurchased>=8){
                freeBooks+=2;
            }
        }else{
            if (nbooksPurchased>=7&&nbooksPurchased<12){
                freeBooks+=1;
            }else if (nbooksPurchased>=12){
                freeBooks+=2;
            }
        }
        System.out.println(freeBooks);
    }
}
