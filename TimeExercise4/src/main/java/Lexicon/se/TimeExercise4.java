package Lexicon.se;

import java.time.LocalDate;

public class TimeExercise4 {
    public static void main(String[] args) {
        String time = "2022-06-21";
        LocalDate now = LocalDate.parse(time);
        System.out.println(now);
    }
}
