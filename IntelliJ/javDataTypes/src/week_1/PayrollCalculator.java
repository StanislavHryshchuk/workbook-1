package week_1;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name: " + name + "\n");

        System.out.print("Enter how many hours you work: ");
        float hoursOfWork = scanner.nextFloat();
        System.out.println("You worked: " + hoursOfWork + " hours this week\n");

        System.out.print("Enter your pay rate: ");
        float payRate = scanner.nextFloat();
        System.out.println("Your pay rate is: " + payRate + "$\n");

        if (hoursOfWork > 40) {

            float overTimeHours = hoursOfWork - 40;
            float overTimePayRate = (float) (payRate * 1.5);
            float standart_Rate_HoursOfWork = hoursOfWork - overTimeHours;

            System.out.println("You worked overtime: " + overTimeHours + " hours\n");
            System.out.println("For that amount of time, your new pay rate is: "+ overTimePayRate + "$\n");
            float overTimeGrossPay = overTimeHours * overTimePayRate;

            float grossPay = standart_Rate_HoursOfWork * payRate;

            float totalForWeek = overTimeGrossPay + grossPay;
            System.out.println("Calculating a pay rate...\nGross pay is: " + totalForWeek + "$");

            if (totalForWeek > 1000){
                System.out.println("You're are great worker!!! Thanks for your Job!!");
            }
        } else {
            float grossPay = hoursOfWork * payRate;
            System.out.println("Calculating a weekly salary...\nGross pay for the week: " + grossPay + "$");
        }

    }
}
