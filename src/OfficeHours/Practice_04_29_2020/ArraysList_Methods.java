package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArraysList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1,30);// add the element at the given index

        System.out.println(list);
        System.out.println(list.size());

        int num1=list.get(2);//Integer 20,unboxing

        byte a=100;
        //Integer b=a;

        Byte a2=100;
        int b2 =a2;//unboxing

        ArrayList<String> list2=new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        list2.add(2,"E");
        System.out.println(list2);

        for (int i=0;i<=list2.size()-1;i++) {// i: 0,1,2,3,4,
            String str=list2.get(i);
            System.out.println(str);
        }
        System.out.println("=============================");
  for (String each:list2){
      System.out.println(each);// each element
  }
  //list2: {A,B,E,C,D}; replace C with F
        //  0 1 2 3 4
        list2.set(3,"F");
        System.out.println(list2);
list2.remove("A");
        System.out.println(list2);
        list2.remove(3);
        System.out.println(list2);
        boolean r1=list2.remove("A");
        System.out.println(r1);
        boolean r2=list2.remove("B");
        System.out.println(r2);
        list2.clear();
        System.out.println(list2);


    }
}
