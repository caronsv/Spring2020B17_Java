package day14_StringClass;
import java.util.Scanner;
public class credentials {
    /*
        userName: cybertek
        pasword: cybertekschool
         */
    public static void main(String[] args) {
        String ValidUserName="cybertek";
        String ValidPasword="cybertekschool";
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your username");
        String inputUsername=input.next();
        System.out.println("Enter your password");
        String inputPassword=input.next();
        if(inputUsername.equals(ValidUserName)&&inputPassword.equals(
                ValidPasword)){
             }else {
            System.out.println("Invalid credentials");



        }
    }
}
