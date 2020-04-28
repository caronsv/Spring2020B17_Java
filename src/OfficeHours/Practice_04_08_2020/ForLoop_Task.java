package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {
        /*
        print all the numbersbetwen0~100 that can be devision by 3or5
         */
        for(int i=0; i<=100; i++){
            if(i%3 ==0 || i%5==0){
                System.out.print(i + " ");
            }}
        System.out.println("===========================");

        String name="Anna";
        String result="";
        int lastindex=name.length()-1;
        for(int i=lastindex; i>=0;i--){
            result=result+name.substring(i,i+1);
          //  System.out.print(name.charAt(i));
           // result=result+name.charAt(i);
            //3,4==>a
            //2,3==>n
            //1,2==>n
            //0,1==>A

        }
        System.out.println(result);
        if(!name.isEmpty()){
             if(name.equalsIgnoreCase(result)) {
               System.out.println(name + " is palindrome name");
        }else{
            System.out.println(name+ " is not palindrome name");
        }
    }
}}
