package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
        int count=0;
        for(int i=0;i<5;i++) {
           if (nums[i]%2==0 ){
               count++;
           }
        }
        System.out.println(count);


    }
}
