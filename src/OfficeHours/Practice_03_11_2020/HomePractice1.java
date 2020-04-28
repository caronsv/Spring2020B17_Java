package OfficeHours.Practice_03_11_2020;

    import com.sun.deploy.security.SelectableSecurityManager;

    import java.util.Scanner;
public class HomePractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = scan.next();
        String fullName2 = scan.next();
        fullName="Max Payne";
        fullName2="Alan Wake";
        System.out.println(fullName+"\n User found!");
        boolean valid= (fullName)!=(fullName2)&&(fullName2)==(fullName);
        System.out.println("User not found!");}

    }


