package day26_MethodOverLoading;

public class MethodOverLoading3 {

 public static void main(String[] args) {
        sum(10,20);
        sum(12.3,5.5);

        sum(10,20.4);
        double num1=sum(10,15.5);
     System.out.println(num1);

     double num2=sum(25l,30l);
     System.out.println(num2);

     sum((int)40l, (int)50l);

     sum(5,4);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static double sum(double a, double b) {
     return a+b;
    }
}
