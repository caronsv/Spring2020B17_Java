package day14_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {
        String str=""; //  true         true or false
        str.isEmpty();
        boolean bool1=str.isEmpty();
        System.out.println(bool1);


        String username="";   //empty
        System.out.println("please provide the user name first");

        String s1="Cat";
        String s2=new String("Cat");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String z1="Tiger";
        String z2=new String("Tiger");
        String z3="Tiger";
        String z4="Lion";
        System.out.println(z1==z2);
        System.out.println(z2==z3);
        System.out.println(z1==z3);

        System.out.println(z1.equals(z2));
        System.out.println(z2.equals(z3));
        System.out.println(z1.equals(z3));
        System.out.println(z3.equals(z4));
        /*
        userName: cybertek
        pasword: cybertekschool
         */



    }

}
