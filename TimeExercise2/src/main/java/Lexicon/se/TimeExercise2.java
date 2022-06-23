package Lexicon.se;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeExercise2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String a = now.format(DateTimeFormatter.ofPattern("eeee dd MMM YYYY"));
        System.out.println(a);
    }
}
