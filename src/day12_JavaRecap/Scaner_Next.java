package day12_JavaRecap;
// import PackageName.className;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Scaner_Next {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fullAdress="";

        System.out.println("enter the number of the building: ");
        short Bnumber = scan.nextShort();
        fullAdress+=Bnumber+" ";
        System.out.println("enter the Stree Name: ");
        String streetName = scan.next();
        fullAdress+=streetName+" ";
        System.out.println("enter the type of the road");
        String roadType= scan.next();
        fullAdress+=roadType+", ";
        System.out.println("enter city name, state, zipcode");
        String cityName=scan.next();
        fullAdress+=cityName+" ";

        String state=scan.next();
        fullAdress+=state+", ";

        int zipCode=scan.nextInt();
        fullAdress+=zipCode;

        System.out.println("adress is: "+ fullAdress);
    }

}
