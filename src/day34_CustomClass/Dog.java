package day34_CustomClass;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Dog {
    String breed;
    int age;
    String size;
    String color;
    String name;
public void eating(String food){
    System.out.println(name+" is eating "+food);
}
public void drinking(String drink){
        System.out.println(name+" is drinking "+drink);


}
    public void playing(String toy){
        System.out.println(name+" is playing "+toy);
}
public void studying(String object){
    System.out.println(name+" is studying "+object);
}
    public void setDogInfo(String breed,String size, int age,String color,String name){
        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
        this.name=name;


    }
    public String toString(){
        return "Dog Name: "+name+", breed: "+breed+", size: "+size +", color: "+color+", age: "+age;
    }



}
