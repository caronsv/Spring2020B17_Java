package day38_Constructors;

public class ConstractorPractice {
    public ConstractorPractice(){
        this(10.0);
        System.out.println("A");
        //this (0.5); //rule #3
    }
    public ConstractorPractice(int a){
       // this();
        this(10.5);
        System.out.println("B");
    }
    public ConstractorPractice(double a){
        //this(); rul #5
        //this(5.5); rul #5
       // this(10); rul #5
        System.out.println("C");
    }
    public static void main(String[]args){
        new ConstractorPractice(10);

    }
}
