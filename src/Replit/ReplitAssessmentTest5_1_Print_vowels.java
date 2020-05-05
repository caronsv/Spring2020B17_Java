package Replit;
import java.util.Scanner;

public class ReplitAssessmentTest5_1_Print_vowels {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();
            //write your code below
            String volwels="";
            for(int i=0;i<word.length();i++){
                char leters=word.charAt(i);
            if(leters=='a'||leters=='e'||leters=='u'||leters=='i'||leters=='o'||leters=='y'){
                volwels+=leters+" ";}}
                System.out.println(volwels);
        }}
/*}
Inputs:
String word;
Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
HINT:  vowel is a letter representing a vowel sound, such as a, e, i, o, u.
In: howdyho
oo
In: huehuehuehue
ueueueue
In: poopoo what idk what im doing
ooooaiaioi
 */