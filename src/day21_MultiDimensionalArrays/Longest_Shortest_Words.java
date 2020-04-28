package day21_MultiDimensionalArrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {
        String[] names= {"Reem", "Omer", "Muhar", "Emrah", "Mohammed", "Ana"};
        int maxLengthString= names[0].length();
        int minLengthString=names[0].length();
        String logestword="";
        String shortestword="";
        for (int i=0;i<=names.length-1; i++){
        if (names[i].length()>maxLengthString){
            maxLengthString=names[i].length();
            logestword=names[i];
        }
        if(names[i].length()<minLengthString){
            minLengthString=names[i].length();
            shortestword=names[i];

        }
        }

        System.out.println(logestword);
        System.out.println(shortestword);

    }


}

