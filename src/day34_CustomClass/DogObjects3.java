package day34_CustomClass;

public class DogObjects3 {
    public static void main(String[] args) {

        String food1="Chicken";
        String food2="fish";

        String drink1="water";
        String drink2="milk";

        String toy1="ball";
        String toy2="doll";

        String object1="Java";
        String object2="software";


        Dog dog1=new Dog();
        dog1.setDogInfo("Boxer","big",4,"Red","Desha");

        Dog dog2=new Dog();
        dog2.setDogInfo("Picines","small",1,"Orange","Oza");

       dog1.eating(food1);
       dog2.eating(food2);
       dog2.drinking(drink1);
       dog1.drinking(drink2);
        dog1.playing(toy1);
        dog2.playing(toy2);

        Dog dog4= new Dog();
        dog4.setDogInfo("Alabay","Extra big",5,"brown", "Putin");

        Dog dog3= new Dog();
        dog3.setDogInfo("Poodle","small",2,"white", "Balonka");

        System.out.println("=======================");


        Dog[] dogPark={dog1,dog2,dog3,dog4};

        for (int i=0;i<dogPark.length;i++){
            dogPark[i].eating("Chicken");
        }
        for (Dog each:dogPark){
            each.drinking(drink1);
        }
        for (int i=0;i<dogPark.length;i++){
            dogPark[i].playing("football");
        }
        for (int i=0;i<dogPark.length;i++){
            dogPark[i].studying(object1);
        }
    }
}
