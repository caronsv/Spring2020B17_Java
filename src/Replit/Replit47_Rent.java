package Replit;

import java.util.Scanner;

public class Replit47_Rent {
    public static void main(String[] args) {
    int propertyPrice = 0;
    int numberOfBedrooms, garageSpots;
    float metroAccessibility, schoolScore, highwayAccessibility;
    boolean backyard, smoking, garage;
    String houseType;
    Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");

        String housetype="Condo";
        String housetype1="Townhouse";
        String housetype2="Single family home";
        System.out.println("Enter your property type:");
        String type=scan.nextLine();
        if(type.equalsIgnoreCase(housetype)) {
            propertyPrice+=50000;}
        if(type.equalsIgnoreCase(housetype1)) {
            propertyPrice+=75000;}
        if(type.equalsIgnoreCase(housetype2)) {
            propertyPrice+=95000;}
        System.out.println("How many bedrooms do you have?");
        int bedroom=scan.nextInt();
        int numberBedrooms=bedroom*30000;
        propertyPrice += numberBedrooms;
        System.out.println("Do you have a backyard?");
        boolean yard=scan.nextBoolean();
        if (yard == true && type.equalsIgnoreCase(housetype)) {
            System.out.println("Backyard is not available for condo!");
        }else if(yard==true){
            propertyPrice+=5000;
        }
        System.out.println("Do you have garage?");
        boolean garagee=scan.nextBoolean();
        System.out.println("How many spots?");
        int spot=scan.nextInt();
        int garagespot=spot*20000;
        if (spot > 10) {
            System.out.println("Pardon, it's not a public parking!");
        } else {
            propertyPrice += garagespot;
        }
        System.out.println("How close is metro station?");
        float metro=scan.nextFloat();
        if (metro <= 1) {
            propertyPrice += 10000;
        } else if (metro > 1 && metro < 3) {
            propertyPrice += 5000;
        }
        System.out.println("How close is highway?");
        float highway=scan.nextFloat();
        if (highway <= 1) {
            propertyPrice += 15000;
        } else if (highway > 1 && highway < 5) {
            propertyPrice += 8000;
        } else if (highway > 5 && highway <= 20) {
            propertyPrice += 4000;
        }
        System.out.println("What's the rating of nearest school?");
        float rateschool=scan.nextFloat();
        System.out.println("Does any of your family members smoking?");
        if (rateschool > 8 && rateschool <= 10) {
            propertyPrice += 45000;
        } else if (rateschool < 8 && rateschool >= 4) {
            propertyPrice += 20000;
        }else{
            propertyPrice+=5000;}
        boolean smoke=scan.nextBoolean();
        if(smoke==true){
            propertyPrice-=5000;}
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+propertyPrice+"$");
    }
}