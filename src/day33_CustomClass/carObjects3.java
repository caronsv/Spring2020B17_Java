package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObjects3 {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setCarInfo("BMW","X6",2020, "White");
        car1.getCarInfo();

        Car car2=new Car();
        car2.setCarInfo("Toyota","Cirola",2012,"Red");
        car2.getCarInfo();

        Car car3=new Car();
        car3.setCarInfo("Audio","Q7",2019,"Gray");
        car3.getCarInfo();

        System.out.println("================================================");

        Car [] cars={car1,car2,car3};
        for (int i=0;i<cars.length;i++){
            cars[i].getCarInfo();
        }

        System.out.println("===================");
    for (Car eachCar: cars){
        eachCar.getCarInfo();
    }

        System.out.println();
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);


    }
}
