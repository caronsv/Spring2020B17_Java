package day08_IfStatments;


public class WarmupTasks {

    public static void main(String[] args) {
        double n1 =100.5;
        double n2 = 100.5;
        double n3 = 300.5;

        boolean n1Equaln2 = n1==n2 && n1 != n3;     // if n1 equal to n2 and does equal n3, that makes n1 equal n2 only
        boolean n1Equaln3 = n1 == n3 && n1 != n2;  // only n1 and n3 are equal
        boolean n2Equaln3 = n2 == n3 && n2 != n1;  // only n2 == n3

        boolean allEqual = n1 == n2 && n1 ==n3 ;    // all of them are equal


        boolean noneOfThemEqual = n1 != n2 && n1 != n3  &&  n2 != n3;  // none of them are equal

        //   boolean noneEqual = n1Equaln2 == false && n1Equaln3 == false && n2Equaln3 == false;    // none of them are equal

        //   boolean noneEqual2 = !n1Equaln2  && !n1Equaln3  && !n2Equaln3 ;  // none of them are equal


        if(n1Equaln2){  // n1 == n2  && n1 != n3
            System.out.println("n1 is equal to n2");
        }

        if(n1Equaln3){  // n1 == n3 && n1 != n2
            System.out.println("n1 is equal to n3");
        }

        if(n2Equaln3){ // n2 == n3 && n2 != n1
            System.out.println("n2 is equal to n3");
        }

        if(allEqual){
            System.out.println("n1 is equal to n2 and n3");
        }

        if(noneOfThemEqual){
            System.out.println("None of them are equal");
        }
        /*
         if(n1Equaln2){  // n1 == n2  && n1 != n3
            System.out.println(n1+ " is equal to "+ n2);
        }

        if(n1Equaln3){  // n1 == n3 && n1 != n2
            System.out.println(n1+" is equal to "+ n3);
        }

        if(n2Equaln3){ // n2 == n3 && n2 != n1
            System.out.println(n2 +" is equal to "+n3);
        }

        if(allEqual){
            System.out.println(n1+" is equal to n2 and "+ n3);
        }

        if(noneOfThemEqual){
            System.out.println("None of them are equal");
         */



    }


}
