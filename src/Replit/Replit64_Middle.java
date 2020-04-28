package Replit;

import java.util.Scanner;

public class Replit64_Middle {
    /* 1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
          - Single character, print that character 3 times
      # ==> ###
      q ==> qqq
2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int numOfCharacters=word.length();
        String middle="";
        if(numOfCharacters%2!=0 && numOfCharacters>=3){   //odd
            middle=""+word.charAt(numOfCharacters/2);
            System.out.print(middle);
        }else if(numOfCharacters==1){  // a=aaa
            middle=""+word.charAt(0);
            System.out.print(middle+middle+middle);   // even
        }else if(numOfCharacters%2==0 && numOfCharacters>=4){
            middle+=word.substring(numOfCharacters/2-1,numOfCharacters/2+1);
            System.out.print(middle);  //ab=abab
        }else if (numOfCharacters==2){
            middle+=word.substring(0,2);
            System.out.print(middle+middle);

        }}}
