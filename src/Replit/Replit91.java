package Replit;
/*
Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1
 */

import java.util.Arrays;
import java.util.Scanner;

public class Replit91 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String [] word=str.split(" ");
        int count=0;
        for(String each:word){
        while(each.contains("hi")) {
            each = each.replaceFirst("hi","");
                 count++;   }}
        System.out.println(count);

    }
}
