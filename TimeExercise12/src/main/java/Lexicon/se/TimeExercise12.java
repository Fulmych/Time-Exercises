package Lexicon.se;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeExercise12 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        String type = time.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println(type);
    }
}
