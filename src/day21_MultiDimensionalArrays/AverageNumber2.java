package day21_MultiDimensionalArrays;

public class AverageNumber2 {
    public static void main(String[] args) {
        int[]arr={10, 20, 30, 40, 50, 60, 70, 50, 40, 25};// aver
        int length=arr.length;
        int sum =0;
        for(int i=0;i<=length-1;i++){
            int eachNum=arr[i];
            sum+=eachNum;
        }
        System.out.println(sum);
        System.out.println(sum/length);


        int[]arr2={1,2,3};

        System.out.println(5/3);
        System.out.println(5/(double)3);






    }
}
