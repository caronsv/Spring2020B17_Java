package day26_MethodOverLoading;
/*
1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
 */
public class Frequency {
    public static void main(String[]args) {
        String str = "ABB";
        char ch = 'A';
        char[] arr = str.toCharArray();

        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;

            }
        }
        System.out.println(count);

        String str2="AAAAABBBBCCCCTGBNJJ";
        char ch2='B';
        int num2=frequency(str2,ch2);
        System.out.println(num2);



    }
    public static int frequency(String str,char ch){
        char[] arr = str.toCharArray();

        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;

    }}
        return count;
    }
}




