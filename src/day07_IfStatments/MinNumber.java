package day07_IfStatments;

public class MinNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 400.5;
        boolean aMin =a<b&&a>c;//if a less than both b and c, the a is maximum
        boolean bMin =b<a&&b<c;//if a greater than both b and c, the a is maximum
        boolean cMin =c<a&&c<b;//if a greater than both b and c, the a is maximum

        if(aMin){
            System.out.println("is the minimum number");
        }
    }

}
