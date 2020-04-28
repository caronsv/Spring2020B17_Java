package day23_methods;

import java.util.Arrays;

/*
1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class UniqueValues {
    public static void main(String[] args) {

        String [] arr ={"A", "B", "A"};// B
      for (String each: arr) {

          // "A"
          int count2 = 0;
          for (int i = 0; i <arr.length; i++) {
              if (arr[i].equals(each)) {
                  count2++;
              }
          }
          if (count2 == 1) {
              System.out.println(each);
          }

      }

        System.out.println("========================================");
        for (String each2:arr){     //3aqw21
            int count =0;
            for ( String each  : arr  ){
                if (each.equals(each2)) {
                    count++;
                }}

        if (count == 1) { //if the character is unique
            System.out.println(each2);



    }
}}}
