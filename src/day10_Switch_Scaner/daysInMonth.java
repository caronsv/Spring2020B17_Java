package day10_Switch_Scaner;

public class daysInMonth {
    public static void main(String[] args) {
        int num=3;
        boolean days28=num==2;
        boolean days30=num==4||num==6||num==9||num==11;
        String result="";
        if (num>0&&num<13){
            result=(days28)?"has 28 days":(days30)?"has 30 days":"Has 31 days";

        }else{
            result="Invalid";
            System.out.println(result);
        }

    }
}
