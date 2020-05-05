package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Siemes", "Gray", 6, "Sacha");
        System.out.println(cat1);

        Cat cat2 = new Cat();
        cat2.setCatInfo("Scotish", "White", 7, "Murka");

        Cat cat3 = new Cat();
        cat3.setCatInfo("Calico", "brown", 6, "Cinamom");

        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1, cat2, cat3));

        for (int i=0;i<catList.size();i++){
            System.out.println(catList.get(i));
        }

        System.out.println("============================");
        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("=========================");

        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("sish kabab");

        System.out.println("==============================");
    cat1.drink("milk");
    cat2.drink("water");
    cat3.drink("juice");


    }
}
