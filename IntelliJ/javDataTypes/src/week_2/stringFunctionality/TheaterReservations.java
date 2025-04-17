package week_2.stringFunctionality;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter formatter;

        System.out.println("--------Welcome to Theater reservation menu---------------\nWe will need some information from you.");

        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("What date(MM/dd/yy) you will be coming? ");
        String userDate = scanner.next();
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dateOfComming = LocalDate.parse(userDate,formatter);

        System.out.print("How many ticket you want to purchase?");
        int numberOfTickets = scanner.nextInt();

        System.out.println(numberOfTickets + " tickets reserved for " + dateOfComming + " under " + userName);

    }
}
