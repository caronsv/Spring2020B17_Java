package day28_DateTime;

import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime  tim1 = LocalTime.now();
        System.out.println(tim1);
        LocalTime time2 =LocalTime.of(15,30,45);
        System.out.println(time2);

    }
}