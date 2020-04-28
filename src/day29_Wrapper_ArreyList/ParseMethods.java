package day29_Wrapper_ArreyList;

public class ParseMethods {
    public static void main(String[] args) {
        String str="123";
         int a1=Integer.parseInt(str);
        System.out.println(str+1);//text "123"+1==1231
        System.out.println(a1+1);// number 123+1==124


        byte b1=Byte.parseByte(str);
        System.out.println(b1+6);
        Integer I1=(int)Byte.parseByte(str);
        System.out.println(I1);


    }
}
