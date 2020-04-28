package Replit;

import java.util.Scanner;

public class Replit51Tip {
    /*Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:*/
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
 System.out.println("Split:");
 String split =input.next();                                                                         

 System.out.println("Number of people:");
 int people =input.nextInt();

 System.out.println("Check amount:");
 double checkAmont=input.nextDouble();

 System.out.println("Service Quality:");
 String quality=input.next();
 String numPeople=(people==1)?"&":(people==2)?"&&":(people==3)?"&&&"
         :(people==4)?"&&&&":"&&&&&";
 double tip =(quality.equals("Poor"))?checkAmont*0.05: (quality.equals("Fair")) ? checkAmont*0.1
         :(quality.equals("Good"))?checkAmont*0.15:(quality.equals("Great"))?checkAmont*0.20:
         (quality.equals("Excellent"))  ? checkAmont*0.25:   0.00;
 System.out.println("Number of people entered: " +numPeople);
 System.out.println("Total to pay: "+(checkAmont+tip));
 System.out.println("Total tip: "+tip);
 System.out.println("Total per person: "+(checkAmont+tip)/people);
 System.out.println("Tip per person: "+tip/people);

    }
}
