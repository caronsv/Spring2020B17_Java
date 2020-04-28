package day26_MethodOverLoading;

public class MySolution {
    /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */
    public static void main(String[] args) {
        sum(10,20);
        sum(10.0,20.4);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}