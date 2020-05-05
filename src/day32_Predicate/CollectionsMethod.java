package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
   int max= Collections.max(list);
        System.out.println(max);

        int min=Collections.min(list);
        System.out.println(min);



ArrayList<Integer> number=new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
// second max: 3
        System.out.println("=============================");
Integer maxNum= Collections.max(number) ;
number.removeAll(Arrays.asList(maxNum));
        System.out.println(number);
int secondMax=Collections.max(number);


        System.out.println(secondMax);
        System.out.println("=====================================");

        ArrayList<Integer> number2=new ArrayList<>(Arrays.asList(1,1,2,3,4,4));

        Integer minNum=Collections.min(number2);//1
number2.removeAll(Arrays.asList(minNum));
        System.out.println(number2);
    int secondMin=Collections.min(number2);
        System.out.println(secondMin);
        System.out.println("=======================");
        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5));//{1,2,3,4,5}
        //                         0 1 2 3 4
        System.out.println(list3);//[1,2,3,4,5]
        Collections.swap(list3,0,4);//{5,2,3,4,1}
        System.out.println(list3);

        System.out.println("===================================");
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Omer", "Omer","Mary","Shy","Fatish","Omer"));

        Collections.replaceAll(names,"Omer","Irina");
        System.out.println(names);


    }
}
