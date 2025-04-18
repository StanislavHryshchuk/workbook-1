package week_2.stringFunctionality;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class projectDateFormating {

    static Scanner scanner = new Scanner(System.in);
    static DateTimeFormatter formatter;

    public static void main(String[] args) {
        System.out.println("please enter the date(yyyy-MM-dd)");
        String userDate = scanner.nextLine();
        System.out.println("What format you want to see:\n1. dd/MM/yyyy\n2. d/MMM/yy\n3. MMMM/d/yyyy");
        String userChoice = scanner.nextLine();
        if (userChoice.equals("1")){
            formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate firstTypeOfDate = LocalDate.parse(userDate);

            System.out.println(firstTypeOfDate.format(formatter));
        } else if (userChoice.equals("2")){
            formatter = DateTimeFormatter.ofPattern("d/MMM/yy");

            LocalDate secondTypeOfDate = LocalDate.parse((userDate));

            System.out.println(secondTypeOfDate.format(formatter));
        } else if (userChoice.equals("3")){
            formatter = DateTimeFormatter.ofPattern("MMMM/d/yyyy");

            LocalDate thirdTypeOfDate = LocalDate.parse(userDate);

            System.out.println(thirdTypeOfDate.format(formatter));
        }
    }
}
