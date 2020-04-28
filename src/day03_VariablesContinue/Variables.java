package day03_VariablesContinue;

public class Variables {
    public static void main(String[] args) {

        double rate = 55;
        float stateTaxRate = 0.04F;
        float federalTaxRate = 0.22f;
        byte weeklyHours = 40;

        //salary = rate * weeklyHour * 4 * 12
        double salary = rate * weeklyHours * 52;

        //stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        //FederalTax = salary * stateTaxRate
        double federalTax = salary * federalTaxRate;

        //income after tax = salary - (stateTax + federalTax);
        double incomeAfterTax = salary - (stateTax + federalTax);

        System.out.println("Your salary is: " + salary);  // concatenation
        System.out.println("State tax is: " + stateTax); //state tax is 4575

        System.out.println("Federal tax is: " + federalTax);
        System.out.println("Total tax is: " + (stateTax + federalTax));

        /*
        System.out.println(9 + 3 ); //12, addition
        System.out.println("9" + "3" ); //93
        System.out.println(9 + "3" ); //93
        */
    }




}
