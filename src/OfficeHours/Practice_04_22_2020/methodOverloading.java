package OfficeHours.Practice_04_22_2020;

public class methodOverloading {
    public static void main(String[] args) {

        method1();
        method1(1);
        method1(1,2);
        System.out.println("=============================");
        int num1=method1(20);
        System.out.println(num1);
        System.out.println("============================================");
        method1(10);
    }




    public static void method1(){
        System.out.println("Hello world");

    }
    public static int method1(int a){
        System.out.println("Hello cybertek");
        return 10;

    }
    public static void method1(int a, int b){
        System.out.println("Hello Batch 18");

    }
}
