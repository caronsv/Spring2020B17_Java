package day13_StringClass;

import java.util.Scanner;

public class ShippingInfo {
    /*
    2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your building number");
        String buildingNum= input.next();//112A
        input.nextLine();  // enter

        System.out.println("Enter your street adress");
        String streetAdress= input.nextLine();

        System.out.println("Enter your city name");
        String cityName= input.nextLine();

        System.out.println("Enter your state");
        String stateName= input.nextLine();

        System.out.println("Enter your zip code");
        String zipCodeName= input.nextLine();

        System.out.println("Enter your full name");
        String fullName= input.nextLine();

        String result = "Ship To:  "+fullName+"\n\t\t"+buildingNum+" "+streetAdress+"\n\t\t"+cityName+", "+stateName+" "+zipCodeName;

        System.out.println(result);









    }
}
