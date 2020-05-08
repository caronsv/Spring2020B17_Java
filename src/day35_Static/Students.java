package day35_Static;

public class Students {// for CybertekSchool only
    /*
    creat a
     */
    String name;
    int id;
    double gpa;
    static String school="Cybertek";
    public  void setInfo(String name,int id, double gpa){
        this.name=name;
        this.id=id;
        this.gpa=gpa;
    }
    public static void printSchoolName(){
        System.out.println("School name is "+school);
    }
    public  String toString(){
        return "Name: "+ name+", School name: "+school;
    }
}
