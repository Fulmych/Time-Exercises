package Lexicon.se;

import java.time.LocalDate;
import java.time.Month;

public class TimeExercise6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate tenPlus = now.plusYears(10);
        LocalDate tenMinus = tenPlus.minusMonths(10);
        int time = tenMinus.getYear();
        System.out.println(time);
    }
}
