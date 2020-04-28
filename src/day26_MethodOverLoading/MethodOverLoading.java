package day26_MethodOverLoading;

public class MethodOverLoading {

    public static void main(String[] args) {
        method(10);//Original method
        method(10,20);


    }
    public static void method(int a){
        System.out.println("Original method");

    }
    public static void method(int a, int b){
        System.out.println("Overloaded method");

    }
}
