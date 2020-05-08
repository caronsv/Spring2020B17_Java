package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String name="Cybertek School";
    static Tester tester1=new Tester();
    //tester1.setInfo("Sveta",123,"SDET",12000);
int insVariable;
    /*
    gets executed as soon as the class is loaeded
    designed to initialize static variable*/
    static {
    name="Cybertek School";
    tester1.setTesterInfo("Sveta",123,"SDET",12000);
        tester1.setTesterInfo("Anna",123,"SDET",12000);

//        StaticBlock4 obj1=new StaticBlock4();
//       obj1.insVariable=300;// do not use stativ block for initializing instance variable

    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);


    }
}
