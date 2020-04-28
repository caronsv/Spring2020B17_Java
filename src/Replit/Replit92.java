package Replit;

import java.util.Scanner;

public class Replit92 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long count=1;
        for (int i=n;i>=1;i--){
            count*=i;
        }
        System.out.println(count);


    }
}
/*
In mathematics, the factorial of a positive integer n,
denoted by n!, is the product of all positive integers less than or equal to n.
Calculate factorial and output result to the console.
Example:
input: 5
output: 120

 */