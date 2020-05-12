package day37_Constructors;

public class CarObject {
    public static void main(String[] args) {
    Car car1=new Car("Toyota","Corola",2020,32000,"White");
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1.color);
        System.out.println(car1);

        Car car2=new Car("Mersedess","Benz",2000,20000,"Black");

        System.out.println(car2);
        Car car3=new Car("Opel","Vectra",1990, 5000,"Red");
        System.out.println(car3);

    }}
