package Replit;

import java.util.Scanner;

public class LoopDraw {
    public static void main(String[] args) {

    /*you get a number, write a code that draws a rectangle outline the size of that number.
    each rectangle row is 3 x: xxx
    inner rectangle row is "x  x"
            for example:
    n = 2
    xxx
    x  x
    x  x
    xxx
       n=3
    xxx
    x  x
    x  x
    x  x
    xxx
*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("XXX");
        int i = 0;
        while (i < n) {
            System.out.println("X X");
            i++;
        }
        System.out.println("XXX");






    }}