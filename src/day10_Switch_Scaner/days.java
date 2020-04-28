package day10_Switch_Scaner;

public class days {
    public static void main(String[] args) {
        int num = 0;
        String result="";
        if (num >= 1 && num <=7) {// or (num>0 && num<8)
            result=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wendnesday":(num==4)?"Thursday"
                    :(num==5)?"Friday":(num==6)?"Saturday":(num==7)?"Sunday":"Invalid";

        }
        System.out.println(result);
    }
}
