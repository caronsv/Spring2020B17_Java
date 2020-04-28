package day26_MethodOverLoading;

import java.util.Arrays;

public class MethodOverLoading2 {
    /*
    first method: print the sum of two int numbers
    second method: print the sum of three int numbers
    third method: print the sum of four int numbers
     */
    public static void main(String[] args) {

        sum2Numbers(10, 5);

        sum3Numbers(10, 5, 15);

        sum4Numbers(10, 20, 30, 5);


//        int []arr={5,4,7,1,2};
//        Arrays.sort(arr);
        sum(10, 5);
        sum(10,20,30);
        sum(10,20,30,40);
        sum(10,20,30,40);

        int []arr1={3,2,1};
        char[]arr2={'n','s','a'};
        double[]arr3={7.4, 6.5, 20.5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));



    }
    public static void sum2Numbers(int a,int b){
        System.out.println(a+b);
    }
    public static void sum3Numbers(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum4Numbers(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
}

//===============================================
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static  void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);

    }



}
