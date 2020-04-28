package day17_WhileLoops;

public class BranchingStatements {

    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            if(i%2!=0){
                System.exit(0);
            }
            System.out.println(i);
        }
        System.out.println("Test compleated");
    }
}
