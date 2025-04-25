package week_3.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class dateTimeExr {
    static Scanner scanner = new Scanner(System.in);
    static DateTimeFormatter formatter;
    public static void main(String[] args) {
        //1
        LocalDate ld = LocalDate.now();
        System.out.println("1: " + ld);
        //2
        LocalDate ld1 = LocalDate.of(2025,12,25);
        System.out.println("2: " + ld1);
        //3
        System.out.println("3: " + ld1.getDayOfMonth());
        System.out.println("3: " + ld1.getMonth());
        System.out.println("3: " + ld1.getYear());
        //4
        LocalTime lt = LocalTime.now();
        System.out.println("4: " + lt);
        //5
        LocalTime lt1 = LocalTime.of(3,30);
        System.out.println("5: " + lt1);
        //6
        System.out.println("6: " + lt.getHour());
        System.out.println("6: " + lt.getMinute());
        //7
        formatter = DateTimeFormatter.ofPattern("dd/MMM/yy KK:mma");
        LocalDateTime ldt = ld.atTime(lt);
        System.out.println("7: " + ldt.format(formatter));
        //8
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("8: " + ldt1.format(formatter));
        //9
        LocalDate ld2 = ld.plusWeeks(1);
        System.out.println("9: " + ld2);
        //10
        LocalDate ld3 = ld.minusDays(3);
        System.out.println("10: " + ld3);
        //11
        LocalTime lt2 = lt.plusHours(2).plusMinutes(15);
        System.out.println("11: " + lt2);
        //12
        LocalDateTime ldtTomorrow = LocalDateTime.now().plusDays(1);
        System.out.println("12: " + ldtTomorrow.format(formatter));
        //13
        formatter = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String userDate = "23/Apr/25";
        LocalDate ldUser = LocalDate.parse(userDate,formatter);
        System.out.println("13: " + ldUser.format(formatter));
        //14
        String time = "09:30";
        LocalTime time1 = LocalTime.parse(time);
        System.out.println("14: " + time1);
        //15
        String timeD = "2025-04-01T09:30";
        LocalDateTime timeD1= LocalDateTime.parse(timeD);
        System.out.println("15: " + timeD1);
        //24
        System.out.println("when is your Birthday? Enter the date in format of dd/MM/yy:");
        String userInput = scanner.nextLine();
        formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate ldUserInput = LocalDate.parse(userInput,formatter);
        LocalDate todayDate = LocalDate.now();
        long periodBetween = ChronoUnit.DAYS.between(todayDate,ldUserInput);

        System.out.println(periodBetween);
    }
}
