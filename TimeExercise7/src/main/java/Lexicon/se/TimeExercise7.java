package Lexicon.se;

import java.time.LocalDate;
import java.time.Period;

public class TimeExercise7 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate tenPlus = now.plusYears(10);
        LocalDate tenMinus = tenPlus.minusMonths(10);
        LocalDate birthDay = LocalDate.of(2031,7,22);
        LocalDate past = LocalDate.of(1945,5,8);
        Period period = Period.between(past, birthDay);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("Years: " + years + "\nMonths: " + months + "\nDays: " + days);
    }
}
