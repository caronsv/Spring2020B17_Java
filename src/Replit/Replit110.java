package Replit;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class Replit110 {
    public static void main(String[] args) {
        /*
        Given an int variable n that has already been declared and initialized to a positive value,
         and another int variable j that has already been declared,
         use a for loop to print a single line consisting of n asterisks. Thus if n contains 5,
         five asterisks will be printed. Use no variables other than n and j.
Example:
input: 1
output: *
Example:
input: 3
output: ***
NO NEED FOR ARRAY HERE, JUST USE LOOP
         */
        int j = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        for(j=1;j<=n;j++) {
            System.out.print("*");

        }
    }
}
