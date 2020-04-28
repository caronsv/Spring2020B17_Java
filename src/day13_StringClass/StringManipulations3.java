package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {
        String  str="I like Java programming John";
       int num1= str.indexOf("Jo");
        System.out.println(num1);

        String str2="Cybertek School is awesome";
         int first=str2.indexOf("s");
         int second=str2.indexOf("is");
         int third=str2.indexOf("is")+1;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        int maxIndennumber="Cybertek".length()-1;
        System.out.println(maxIndennumber);

        String names="Sveta";
        int a1=names.indexOf("Good Girl");
        System.out.println(a1);

        String fullname="Svetlana Fedorova";
        String firstname=fullname.substring(0, fullname.indexOf(" "));
        String lastname= fullname.substring(fullname.indexOf(" ")+1);
        System.out.println(firstname);
        System.out.println(lastname);

    }
}
