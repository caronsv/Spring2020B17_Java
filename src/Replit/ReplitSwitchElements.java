package Replit;

public class ReplitSwitchElements {


    public static int[] do_switch(int[] i) {

            int arr = i[0];
            i[0] = i[i.length-1];
            i[i.length-1] = arr;
            return i;
            }

    public static void main(String[] args) {



    }
}
