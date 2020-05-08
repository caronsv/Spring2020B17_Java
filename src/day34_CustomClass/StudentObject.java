package day34_CustomClass;

import day30_ArrayList.ArraysList_Method2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student();

        System.out.println(student1.name);
        student1.setStudentInfo("Adam","England",36,3.5,'M',true);

        Student student2=new Student();
        student2.setStudentInfo("Mike","German",30,3.0,'M',false);

        Student student3=new Student();
        student3.setStudentInfo("Johnny", "US",40,2.5,'M',false );

        Student student4=new Student();
        student4.setStudentInfo("Zoie","Chinese",16,3.9,'F',true);


        Student[]students={student1,student2,student3,student4};

        ArrayList<Student>canGraduate=new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf(p->p.gpa<=3.0);

        System.out.println(canGraduate.size());

        for (int i=0;i<canGraduate.size();i++){
           Student each= canGraduate.get(i);
            System.out.println(each.name+ " can graduate");

        }
        System.out.println("====================================");
        ArrayList<Student>canNotGraduate=new ArrayList<>(Arrays.asList(students));
        canNotGraduate.removeIf(p->p.gpa>3.0);
        System.out.println(canGraduate.size());

        for (Student each:canNotGraduate){
            System.out.println(each.name+" can't graduate");
        }



    }
}
