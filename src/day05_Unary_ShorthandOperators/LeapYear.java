package day05_Unary_ShorthandOperators;

public class LeapYear {
    /*
    1. create aclass called LeapYear, and write a program that can identify if the give
     */
    public static void main(String[] args) {
        short year =2020;
        // leapYear: year % 4 == 0
          // if returns true ==> leapYear, if it returns false==>not leap Year

        boolean leapYear = year % 4 == 0;
        // System.out.println(year + "is leap year: " + leapYear);
        String result = year + "is leap year" + leapYear;
        System.out.println(result);

    }


}
