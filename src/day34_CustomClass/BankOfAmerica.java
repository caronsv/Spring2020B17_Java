package day34_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {


    Tester tester1=new Tester();

    tester1.setTesterInfo("Daenerys Targaryen", 61798789, "Mother of Dragons", 208902.90);
        Tester tester2=new Tester();
        tester2.setTesterInfo("Fatih",12345678,"Senior Tester",100_000);
    Tester tester3=new Tester();
        tester3.setTesterInfo("Sha Rejepov",6235487,"SDET",120000);

        Tester tester4=new Tester();
        tester4.setTesterInfo("Michael", 234567654,"QA", 95000.00);

        Tester tester5=new Tester();
        tester5.setTesterInfo("Madina", 1112233445,"QA", 200000.00);


        ArrayList<Tester>testers=new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

        testers.removeIf(p->!p.jobTitle.contains("SDET"));

        double totalBudget=0;
        for (Tester each:testers){
            System.out.println(each);
            totalBudget+=each.salary;
        }
        System.out.println(totalBudget);





    }}
