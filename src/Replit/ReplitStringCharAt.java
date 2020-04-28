package Replit;

import java.util.Scanner;

public class ReplitStringCharAt {
    public static void main(String[] args) {
       /*using charAt method output the 3rd letter of txt string then
         the 5th letter then the 6th letter.use print not println       */
          Scanner s = new Scanner(System.in);
              String txt = s.next();
               char text1= txt.charAt(2);
        char text2= txt.charAt(4);
        char text3= txt.charAt(5);
        System.out.print(text1+""+text2+""+text3);
    }
}
