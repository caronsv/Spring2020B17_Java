package day33_CustomClass;

public class CarsObjects2 {
    public static void main(String[] args) {
        Car car1=new  Car();
        car1.Brand="Daewoo";
        car1.year=1996;
        car1.model="Nubira";
        car1.color="White";


        Car car2=new Car();
        car2.Brand="Volkswagen";
        car2.year=2006;
        car2.model="Transporter T5";
        car2.color="White";

        Car car3=new  Car();
        car3.Brand="Lexus";
        car3.year=2020;
        car3.model="LF-30";
        car3.color="Black";


        Car car4=new  Car();
        car4.Brand="Lamborghini";
        car4.year=2020;
        car4.model="Huracan EVO";
        car4.color="Red";


        Car car5=new  Car();
        car5.Brand="Tayota";
        car5.year=2020;
        car5.model="Camry";
        car5.color="Silver";


//        String str ="A";
//
//        String str2 = "B";
//
//        String[]  arr={str,str2};
        Car[]cars=  {car1,car2,car3,car4,car5};

        for (Car each:cars) {
            each.getCarInfo();
        }

        System.out.println("==========================");

       for (int i=0;i<cars.length;i++){
           cars[i].getCarInfo();
       }



    }
}
