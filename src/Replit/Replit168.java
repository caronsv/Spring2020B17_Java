package Replit;

public class Replit168 {
    public static void main(String[] args) {

      String name1=coverString("java methods", "me")  ;
      String name2=coverString("Certified Wooden Spoon", "o");
      String name3=coverString("hello hello", "ello");
      String name4=coverString("apples", "pears")  ;
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);

    }
    public static String coverString(String main, String coverME) {
        String result="";
        if(main.contains(coverME)) {
            result=main.replaceAll(coverME,"["+coverME+"]");
        } else {
            result="["+main+"]";
        }
        return result;
    }}
/*
Instructions from your teacher:
coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.

Examples:
coverString("java methods", "me") ) ; ==> "java [me]thods"

coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

coverString("apples", "pears") ) ; ==> "[apples]"
 */