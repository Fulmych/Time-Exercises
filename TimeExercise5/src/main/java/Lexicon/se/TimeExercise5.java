package Lexicon.se;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TimeExercise5 {
    public static void main(String[] args) {
        LocalDate time = LocalDate.of(1945,5,8);
        DayOfWeek day = time.getDayOfWeek();
        System.out.println(day);
    }
}
