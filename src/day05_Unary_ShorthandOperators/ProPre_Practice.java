package day05_Unary_ShorthandOperators;

public class ProPre_Practice {
    public static void main(String[] args) {
        int a = 50;
        a= --a + a++ + a-- + a++;
        System.out.println(a);
        System.out.println(a++);

        int b = 1;//0
        b = -b-- + b++ / -b-- * --b;
        //  b =-1 + 0  / -1   *  -1
        //-1+0*-1
        //-1+0=-1




    }

    //  49  +  49
}
