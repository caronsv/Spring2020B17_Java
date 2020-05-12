package day38_Constructors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        Item item1=new Item("Milk",4.00,1);
        Item item2=new Item("Bread",2.50,2);
        Item item3=new Item("Ice cream",4.99,5);
        System.out.println(item1.calcCost());
        System.out.println(item2.calcCost());
        System.out.println(item3.calcCost());

        System.out.println(item1.calcCost()+item2.calcCost()+item3.calcCost());
        ArrayList<Item>shoppingList=new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3));
          double totalCost=0;
//          //solution 1
//          for (Item each: shoppingList){//each: item1,item2,item3
//              totalCost+=each.calcCost();

              //solution2
              for (int i=0;i<shoppingList.size();i++){
                  totalCost+=shoppingList.get(i).calcCost(); }

        System.out.println("Total: $"+totalCost);
    }
}
