package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        Predicate<Integer>oddNumber=x->x%2!=0;
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);
        System.out.println(list);
        System.out.println("=======================");
        Predicate<Integer>lessThan5=y->y<5;
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,78,8));

        list2.removeIf(lessThan5);
        System.out.println(list2);
        System.out.println("===========================");

        Predicate<String > startWithM=s->s.toLowerCase().startsWith("m");
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Muhtar","Madina","Boris","Sha","Bila"));
        names.removeIf(startWithM);
        System.out.println(names);
        System.out.println("=====================");

        Predicate<String > startWithMorA=each->each.startsWith("M")||each.startsWith("A");
        ArrayList<String> namesList=new ArrayList<>();
        namesList.addAll(Arrays.asList("Muhtar","Alex","Radu","Madina","Boris","Sha","Bila"));
        namesList.removeIf(startWithMorA);
        System.out.println(namesList);
        System.out.println("============================");
Predicate<Character>digits=c->c>=48&&c<=57;
        ArrayList<Character> chars=new ArrayList<>();
        chars.addAll(Arrays.asList('A','B','3','4','6','@','&','Z'));
        chars.removeIf(digits);
        System.out.println(chars);
        System.out.println("========================");


        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        nums.removeIf(p->p>5);
        System.out.println(nums);




    }
}
