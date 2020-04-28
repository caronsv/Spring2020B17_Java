package Replit;

import java.util.Scanner;

public class Replit114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below
        int count = 0;
        for (int i = 0; i < 7; i++) {
            count = 0;
            for (int j = 0; j < 7; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            if (count != 2) {
                System.out.println(nums[i]);
            }
        }

    }}




/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2

 */