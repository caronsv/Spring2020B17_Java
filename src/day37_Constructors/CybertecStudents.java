package day37_Constructors;

public class CybertecStudents {

   static String schoolName;
   String studentName;
   int groupNumber;
   String batch;
   public CybertecStudents(String studentName,int groupNumber, String batch){
       schoolName="Cybertek";
       this.studentName=studentName;
       this.groupNumber=groupNumber;
       this.batch=batch;
   }
   public String toString(){
       return "Name: "+studentName+", Bacth: "+batch+", in group: "+groupNumber+", School name: "+schoolName;
   }}
   class CObjects{
      public static void main(String[] args) {
          CybertecStudents student1=new CybertecStudents("AAA",3,"Batch18");
          System.out.println(student1);
          CybertecStudents student2=new CybertecStudents("BBB",12,"Batch18");
          System.out.println(student2);

      }

    }

