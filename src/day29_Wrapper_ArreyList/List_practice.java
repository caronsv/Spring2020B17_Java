package day29_Wrapper_ArreyList;

import java.util.ArrayList;

public class List_practice {
    public static void main(String[] args) {
        ArrayList<String>shoppingList=new ArrayList<>();
        shoppingList.add("Milk");//size 1
        shoppingList.add("Coffe");//size 2
        shoppingList.add("Bread");//size3
        shoppingList.add("Toilet Paper");// size4
        shoppingList.add("Eggs");//size 5
        System.out.println(shoppingList);

        for (int i=0; i<shoppingList.size();i++)
        {
            System.out.println(shoppingList.get(i));
        }
        System.out.println("==============================");
        for (String each:shoppingList){
            System.out.println(each);
        }
        // size():
       int size= shoppingList.size();// total length of array
        System.out.println(size);







  /*      System.out.println(shoppingList.get(0));
        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.get(3));

   */
    }
}
