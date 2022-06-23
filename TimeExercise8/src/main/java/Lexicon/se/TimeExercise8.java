package Lexicon.se;

import java.time.LocalDate;
import java.time.Period;

public class TimeExercise8 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate laterY = now.plus(Period.ofYears(4));
        LocalDate laterM = laterY.plus(Period.ofMonths(7));
        LocalDate laterD = laterM.plus(Period.ofDays(29));
        System.out.println(laterD);
    }
}
