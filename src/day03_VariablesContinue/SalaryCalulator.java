package day03_VariablesContinue;

public class SalaryCalulator {
    public static void main(String[] args) {
        double rate = 45;
        float stateTaxRate = 0.04F;
        float federalTaxRate = 0.22f;
        byte weeklyHours = 45;

        //salary = rate * weeklyHour * 4 *12
        double salary = rate * weeklyHours * 52;
        // stateTax + salary * stateTaxRate;

        //FederalTax = salary - (stateTax


        System.out.println("Your salary is: " + salary); //concatenation
        System.out.println("State tax is: " ); //concatenation
        int total = 'a' + 'b';
        //          97 + 98 = 195
        System.out.println(total);
        char c1 = 'a';
        // byte b1 = c1; //97
          short sh1 = 'h';
    }

}
