package Lexicon.se;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeExercise15 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime now = LocalDateTime.of(date,
                time);
        System.out.println(now);
    }
}
