package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1=new  Dog();
        dog1.setDogInfo("Husky","big",1, "gray", "Vasy");

       /* System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        */
        //this keywordis us
        Dog dog2= new Dog();
        dog2.setDogInfo("Alabay","Extra big",5,"brown", "Putin");

        Dog dog3= new Dog();
        dog3.setDogInfo("Poodle","small",2,"white", "Balonka");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println("======================");

        Dog dog4=new Dog();
        dog4.setDogInfo("Boxer","big",4,"Red","Desha");

        Dog dog5=new Dog();
        dog5.setDogInfo("Picines","small",1,"Orange","Oza");

        ArrayList<Dog>puppies=new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1,dog2,dog3));
        puppies.addAll(Arrays.asList(dog4,dog5));

        for (int i=0;i<puppies.size();i++){
          Dog eachdog=  puppies.get(i);
            System.out.println(eachdog);
        }
        System.out.println("=================================================");
        puppies.removeIf(p->p.age>2);

        for (int i=0;i<puppies.size();i++){
            Dog eachdog=puppies.get(i);
            System.out.println(eachdog);
        }





    }
}
