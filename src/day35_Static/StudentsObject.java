package day35_Static;

public class StudentsObject {
    public static void main(String[] args) {
        Students student1=new Students();
        student1.name="Sveta";
        System.out.println(student1);
        Students student2=new Students();
        student2.name="Anna";
        System.out.println(student2);

        Students.printSchoolName();

    }
}
