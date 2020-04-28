package day07_IfStatments;

public class Vote {
    public static void main(String[] args) {
        int age =1;
        boolean USCitizen=true;
        boolean eligible= age>=18 && USCitizen==true;

        if(eligible ==true){
            System.out.println("You are eligible to vote");
        }
        if(eligible !=true){
            System.out.println("You are not eligible to vote");
        }
    }
}
