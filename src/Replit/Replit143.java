package Replit;

public class Replit143 {


    public static void printHollowRect(){
        // write your code here:
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            }
        System.out.println();
        }



    }// end your code

    public static void main(String[] args) {

        printHollowRect();
    }




}
/*
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
*****
*   *
*   *
*   *
*****
hint:you will need to use two nested for loops for that, and an if that checks if
its the last or first iteration of the loop (so you will know whet to print "*" or " ")
 */