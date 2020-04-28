package Replit;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Scanner;

public class Replit145 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main
    public static void plus_minus(int[] arr){
        int positive=0;
        int negative=0;
        int zeros=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                positive++;
            }else if (arr[i]<0){
                negative++;
            }else {
                zeros++;
            }}
            System.out.println("positives:"+positive+", ");
            System.out.print("negatives:" + negative + ", ");
            System.out.print("zeros:" + zeros);
                }


    }




/*
Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative ,
 positive and zero numbers are in the array.
for example:
plus_minus (new int[]{1,2,55,-9,-2,0});
will output:
positives:3, negatives:2, zeros:1

 */