package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindMaxAndMin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int max=-214748364;
        int min=214748364;
        int i=1;
        while (i<=3){
        System.out.println("Enter a number");
        int num=input.nextInt();//0, -5, 10

        if(num>max) {
            max = num;
        }
         if(num<min){
             min=num;
         }
            i++;
        }
        System.out.println("maximum number is "+ max);
        System.out.println("minimum number is "+ min);


    }}

