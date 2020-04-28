package day14_StringClass;
/*
	2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
 */
import java.util.Scanner;
public class combineTwoString2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String apple=input.nextLine();
        apple=apple.substring(2);

        System.out.println("Enter second word");
        String banana=input.nextLine();
        banana=banana.substring(3);

        String result=apple+banana;
        System.out.println(result);


    }
}
