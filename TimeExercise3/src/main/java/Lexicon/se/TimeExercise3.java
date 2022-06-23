package Lexicon.se;

import java.time.LocalDate;

public class TimeExercise3 {
    public static void main(String[] args) {
        int a;
        LocalDate monday = LocalDate.of(2022, 6, 13);
        LocalDate rest;
        for (int i = 0; i < 5; i++) {
            rest = monday.plusDays(i);
            System.out.println(rest);

        }
    }

}
