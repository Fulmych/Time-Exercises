package Lexicon.se;

import java.time.LocalTime;

public class TimeExercise10 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        int nano = now.getNano();
        System.out.println(nano);
    }
}
