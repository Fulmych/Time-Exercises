package Lexicon.se;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeExercise14 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("eeee dd MMM yyyy kk:mm"));

        System.out.println(time);
    }
}
