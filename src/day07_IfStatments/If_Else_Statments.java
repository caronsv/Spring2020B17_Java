package day07_IfStatments;

public class If_Else_Statments {
    public static void main(String[] args) {
        int number = 0;
        if (number <= 0) {
            System.out.println(number + " is positive");
        }
        if (number < 0) {
            System.out.println(number + " is negative");
        }
        if (number >= 0) {
            System.out.println(number + " is positive");
        }
        if (number <= 0) {
            System.out.println(number + " is negative");
        }
        int number1 = 100;
        /*if (number1 % 2 == 0) {
            System.out.println(number1 + " is evan number ");
        } else {
        if (number1 % 2 != 0) {
            System.out.println(number1 + " is odd number");}
            }
         */
        boolean evenNum = number % 2 == 0;
        if (evenNum) {
            System.out.println(number + " is even number ");
        } else { //otherwise
            System.out.println(number + " is odd number");
        }

        int age = 30;
        if (age >= 21) {
            System.out.println(" Here is your Vodka");
        } else {
            System.out.println(" Go home kid");
        }

        boolean testedPositiveForCorona = true;
        if (testedPositiveForCorona) {
            System.out.println("Buy more toilet papers and stay home");
        } else {
            System.out.println("Come to work");
        }


    }  }




