package Lexicon.se;

import java.time.LocalTime;

public class TimeExercise11 {
    public static void main(String[] args) {
        String time = "10:11";
        LocalTime t = LocalTime.parse(time);
        System.out.println(t);
    }
}
