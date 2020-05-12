package day37_Constructors;

public class Car {
    String brand;
    String model;
    String color;
    int year;
    double price;

    public Car(String brand,String model, int year,double price,String color){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;
        this.color=color;
    }

    public String toString(){
        return year+" "+brand+" "+model+" $"+price+ " "+color;

    }

}
