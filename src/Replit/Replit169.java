package Replit;

public class Replit169 {
    public static int wordCount(String words) {

        int count =1;
        while (words.contains(" ")){
            count++;
            words=words.replaceFirst(" ","");
        }
        return count;

            }





}
/*
This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
 */
