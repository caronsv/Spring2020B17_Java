package day09_Nestedif_Ternary;

public class IfStatement_WithOutCurlyBraces {
    public static void main(String[] args) {
        int number=100;
       /*
        if(number%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        } */
        if(number%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");

       // without curly braces whatever you write only one and first statement will be displayed
        if(9<8) // if condition is true, first statement will be printed. the rest will be printed regardless if
            // it is true or false
            System.out.println("Abundance");

        System.out.println("Love");// does not include the condition.
        System.out.println("Awareness");//does not include the condition.




        }
}
