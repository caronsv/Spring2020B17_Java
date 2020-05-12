package day38_Constructors;

public class SalaryCalculator {
    double hourlyRate;

    int weeklyHours;

    double stateTaxRate;

    double federalTaxRate;



    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate){

        this.hourlyRate = hourlyRate;

        this.weeklyHours = weeklyHour;

        this.stateTaxRate = stateTaxRate;

        this.federalTaxRate = federalTaxRate;

    }



    public double salary(){ // annual income

        return hourlyRate * weeklyHours * 52 ;

    }



    public double stateTax(){ // total tax paid to the state

        return salary() * stateTaxRate;

    }



    public double federalTax(){ // total tax paid to the federal

        return salary() * federalTaxRate;

    }



    public double salaryAfterTax(){  // salary after tax

        return salary() -  ( stateTax() + federalTax() );

    }



    public String toString(){

        return "Hourly Rate: $"+hourlyRate+

                "\nWeekly Hours: "+weeklyHours+

                "\nGross Salary: $"+salary()+

                "\nState Tax: $"+stateTax()+

                "\nFederal Tax: $"+ federalTax()+

                "\nNet Salary: $"+salaryAfterTax();

    }







}