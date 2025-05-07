package week_3.DailyMoodLogger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class DailyMoodLoggerApp {
    static Scanner scanner = new Scanner(System.in);
    static DateTimeFormatter formatter;

    public static void main(String[] args) {
       userMenu();
    }

    public static void userMenu(){
        boolean running = true;
        System.out.println("\n---------------- Welcome to Daily Mood Logger ---------------------");
        while (running) {

            System.out.println("""
                1. Log a new mood.
                2. View past mods.
                3. Exit""");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1 -> logNewMood();
                case 2 -> viewPastMods();
                case 3 -> running = false;
                default ->  System.out.println("Wrong input");
            }
        }

    }
    public static void logNewMood (){
        try (FileWriter fr = new FileWriter("IntelliJ/javDataTypes/src/week_3/DailyMoodLogger/MoodLog.csv",true)){
            formatter = DateTimeFormatter.ofPattern("dd/MMM/yy KK:mma");

            LocalDate ld = LocalDate.now();
            LocalTime lt = LocalTime.now();
            LocalDateTime ldt = ld.atTime(lt);

            String stringLdt = ldt.format(formatter);

            fr.write("\n" + stringLdt + " - ");
            fr.write( scanner.nextLine()+ "\n");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void viewPastMods(){
        try (BufferedReader br = new BufferedReader(new FileReader("IntelliJ/javDataTypes/src/week_3/DailyMoodLogger/MoodLog.csv"))){
            String line;

            while ((line = br.readLine())!= null){
//                System.out.println(line);
                String[] split = line.split("(?<=\\. )");
                for(String lines: split){
                    System.out.println(lines);
                }

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
