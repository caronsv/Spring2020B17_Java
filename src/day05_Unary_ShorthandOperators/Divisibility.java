package day05_Unary_ShorthandOperators;

public class Divisibility {
    public static void main(String[] args) {
        // DataType VariableName = Data;

        int number = 65;
        boolean divisibleBy2 = number % 2 == 0;
        //if the number can be divided by 2 without any remainder,

        boolean divisibleBy3 = number % 3 ==0;
        // //if the number can be divided by 3 without any remainder,

        boolean divisibleBy5 = number % 5 ==0;
        // //if the number can be divided by 5 without any remainder,

        String result1  = number + " is divisible by 2: " + divisibleBy2; //concantenation
        String result2  = number + " is divisible by 3: " + divisibleBy3;
        String result3  = number + " is divisible by 5: " + divisibleBy5;
        /*
        System.out.println(result+1);
        System.out.println(result+2);
        System.out.println(result+3);
         */
        String finalResult = result1 +" \n " + result2 + " \n " + result3; // concatenation
        System.out.println(finalResult);
    }

}
