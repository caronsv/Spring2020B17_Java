package OfficeHours.Practice_04_01_2020;

public class StringMethods {
    public static void main(String[] args) {
        // charAt(index number): returns the char at the given index, char primitive

        String str1="Java";
        //           0123
        str1.charAt(3);
        char ch1=str1.charAt(3);

        //char ch2=str1.charAt(4); //out of range
       // System.out.println(ch2);\

        //length(): returns the total number of chars,int
        String str2="Cybertek School";
       int total= str2.length();
        System.out.println(total);
        int maxIndex=str2.length()-1;
        System.out.println(maxIndex);
        char ch3=str2.charAt(maxIndex);
        System.out.println(ch3);

        ///concat(str): concatenation, return new String
        String str3 ="Cybertek";
               str3.concat("School");//"Cybertek School"
        System.out.println(str3);

        String str4="Java";
             str4=  str4.concat("is fun");
        System.out.println(str4);


        //toLowerCase()& toUppe6rCase: change the case of the strings to upper or lower cases

        String str5="CYBERTEK SCHOOL";
        str5=str5.toLowerCase();
        System.out.println(str5);

        String str6="sveta";
        str6=str6.toUpperCase();
        System.out.println(str6);


        // trim (): removes unused(white)spaces from the string
        String str7="    Cybertek";
        str7=str7.trim();
        System.out.println(str7);

        String str8 ="        ";
        str8=str8.trim();
        System.out.println(str8.length());

    // substrig()
        String sentence1="I like Java";
        //                0123456789..
        //last index number= length-1
        String word1=sentence1.substring(7, sentence1.length());
        String word2=sentence1.substring(2, 5+1);

String word3=sentence1.substring(2,6)+sentence1.substring(7,sentence1.length() );
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        //substring(beginig index):
        String  sentence2="I like to learn Java";
        //                 0123456789...........
        String r1=sentence2.substring(10);
        System.out.println(r1);

        String r2="Java";
        String r3=r2.substring(0, 2);  // Ja
        String r4=r2.substring(2, 3); //  v
           r4=r4.toUpperCase();   //  V
        String r5=r2.substring(3);
        String result=r3+r4+r5; //JaVa
        System.out.println(result);

        // replace(old str, new str): replaces all the matching ones, ret
        String str ="I like C#, C# is cool";
        str=str.replace("C#", "Java");
        System.out.println(str);
        // replace
        String t1="Java is fun, Java is good";
        t1=t1.replaceFirst(", Java", ", C#");

        System.out.println(t1);

        System.out.println("=============================================");
        // indexOf(str): returns the index of first matching character, as an int
        String y1 = "Today W is Wednesday";
        int a1 =  y1.indexOf("W");  // first W' index num
        int a2 = y1.indexOf("Wednesday");  // second W' index num
        System.out.println(a1);
        System.out.println(a2);

        //lastIndexOf(str): returns the index of last matching character, as an int
        String y2 = "Cybertek School, School";
        int a3 = y2.lastIndexOf("S"); // last S' index number
        System.out.println(a3);


    }
}
