package day38_Constructors;

import java.util.Scanner;

public class CircleObject {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the radius of the circle ");
        double r=scan.nextDouble();
        Circle circle1=new Circle(r);
        double areaOfCircle=circle1.area();
        System.out.println("diametr is: "+circle1.diameter);
        System.out.println("perimetr is: "+circle1.perimeter());
        System.out.println("Area is: "+areaOfCircle);
    }



}
