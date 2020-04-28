package day06_Shorthnd_LogicalOperators;

public class SingleStatement {
    public static void main(String[] args) {
        boolean coldWeather = true;
        if (coldWeather) {
            // true
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }
        boolean coronaDetected = false;
        if (coronaDetected){
            System.out.println("Buy more loilet papers");
            System.out.println("by more water");
            System.out.println("Stay at home");
            System.out.println("Do more Java coding") ;
        }
        System.out.println("==============================");
        int a=100;
        boolean evenNumber = a %2==0;// if a number be devided by 2 without the reminader
        boolean oddNumber = a % 2 !=0;// if the number cannot be by 2 evenly
        if (evenNumber){
            System.out.println(a + " is even number");
        }
        if (oddNumber) {
            System.out.println(a + " is odd number");
        }
        if (!evenNumber){
            System.out.println(a + " is odd number");
        }


    }


}
