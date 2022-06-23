package Lexicon.se;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeExercise16 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate day = now.toLocalDate();
        LocalTime time = now.toLocalTime();
        System.out.println(day + "\n" + time);
    }
}
