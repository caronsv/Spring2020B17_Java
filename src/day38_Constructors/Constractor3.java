package day38_Constructors;

public class Constractor3 {
    public Constractor3(){
       this(9);//int argument
        System.out.println("default");
    }
    public Constractor3(int a){
        this("word");
        System.out.println("Int argument");
    }
    public Constractor3(String str){

    }

    public static void main(String[] args) {
        new Constractor3();
    }
    public void mrthod1(){
        //this();
        mrthod1();
    }
}
