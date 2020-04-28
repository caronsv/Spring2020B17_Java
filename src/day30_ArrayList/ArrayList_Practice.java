package day30_ArrayList;

import java.util.ArrayList;
/*
    2. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
     */
public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>();

        for (int i=0;i<6;i++){
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Integer>reversedlist=new ArrayList<>();

        for (int i=list.size()-1;i>=0;i--){
            int eachNum=list.get(i);//unboxing
          //  System.out.print(eachNum+" ");
            reversedlist.add(eachNum);
        }
        System.out.println(reversedlist);
    }
}
