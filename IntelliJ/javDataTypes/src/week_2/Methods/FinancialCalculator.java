package week_2.Methods;

import java.util.Scanner;

public class FinancialCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        while(running){
            System.out.println("Which calculator you want to use?\nSelect a calculator (1 - 3):\n1. Morgage Calculator\n2. Future Calculator\n3. Present Value Calculator\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 -> morgageCalculator();
                case 2 -> futureCalculator();
                case 3 ->presentValueCalculator();
                case 4 -> {
                    running = false;
                    System.out.println("Thank you for using financial calculators. Have a nice day!");
                }
                default -> System.out.println("Invalid enter. Please enter 1 - 4.");
            }
            if (choice != 4){
                System.out.println("Would you like to try another? (yes | no)");
                String continueCalc = scanner.next();
                switch (continueCalc.toLowerCase()){
                    case "yes" -> {
                    }
                    case "no" -> {
                        running = false;
                        System.out.println("Thank you for using financial calculators. Have a nice day!");
                    }
                    default -> System.out.println("Invalid choice. Please enter yes or no.");
                }
            }
        }


    }
    //----------------------------------------- Morgage Calculator --------------------------------------------------
    public static void morgageCalculator() {
        //    - (M) Monthly Payment
//    - (P) Principal:
//          This is the total amount of the loan.
//    - (r) Annual Interest Rate:
//          The nominal annual interest rate in
//          decimal form (e.g., 7.625% = 0.07625).
//    - (y) Loan Term in Years:
//          How many years the loan lasts.
//    - (n) Number of Monthly Payments:
//          This is 12×y (Because there are 12 monthly payments per year.)
//    - (i) Monthly Interest Rate:
//          This is the annual interest rate divided by 12, i.e. r/12 - Total Interest =(M×n)−P

        System.out.println("-------------------- Welcome Morgage Calculator ---------------------------------");

        System.out.println("1. What is the loan amount?");
        int principal = scanner.nextInt();

        System.out.println("2. What is Loan length?(in years)");
        int loanTermInYears = scanner.nextInt();

        System.out.println("3. What is the interest rate?(in %)");
        double annualInterestRate = annualInterestRate(scanner.nextDouble());

        int numberOfMonthlyPayments = loanLengthInYears(loanTermInYears);
        double monthlyInterestRate = monthlyInterestRate(annualInterestRate);

        double monthlyPayment = monthlyPaymentFormulaMethod(principal, monthlyInterestRate, numberOfMonthlyPayments);
        System.out.printf("Your monthly payment would be: $%,.2f%n", monthlyPayment);

        double totalInterest = totalInterest(monthlyPayment, numberOfMonthlyPayments, principal);
        System.out.printf("Your Total Interest wold be: $%,.2f%n", totalInterest);
    }

    // ------------------------------------------ Future Calculator --------------------------------------------------
    public static void futureCalculator(){
        //- (FV) Future Value
        //- (P) Principal:
        //      This is the initial deposit amount.
        //- (r) Annual Interest Rate:
        //      The nominal annual interest rate in decimal form (e.g., 1.75% = 0.0175).
        //- (t) Number of Years:
        //      The total number of years the deposit will earn interest.
        //- (d) Days Per Year:
        //      Daily compounding assumes 365 days per year.
        //- (td) Total Number of Days:
        //      This is 365 × t (because there are 365 days per year).
        //- (tie) Total Interest Earned = FV - P.
        System.out.println("-------------------- Welcome to Future Value Calculator ---------------------------------");
        System.out.println("How much you wold like to deposit?");
        int initialDeposit = scanner.nextInt();

        System.out.println("For how long you want to deposit? (ex. 1yr., 3yr., etc.)");
        int numberOfYears = scanner.nextInt();

        System.out.println("What is the annual interest rate? (ex. 2%, 5% etc.)");
        double annualInterestRate = annualInterestRate(scanner.nextDouble());

        int numbersOfDays = totalNumbersOfDays(numberOfYears);
        double futureValue = formulaMethod(initialDeposit, annualInterestRate, numbersOfDays, numberOfYears);
        double totalInterest = totalInterestEarned(futureValue, initialDeposit);

        System.out.printf("Your future value would be: $%.2f%n", futureValue);

        System.out.printf("Your total interest earned would be: $%.2f%n", totalInterest);

    }
    //------------------------------------------- Present Value Calculator -------------------------------------------
    public static void presentValueCalculator(){
        System.out.println("-------------------- Welcome Present Value Calculator ---------------------------------");

        System.out.println("What is your monthly payout?");
        int monthlyPayout = scanner.nextInt();

        System.out.println("What is your expected interest rate?");
        double expectedInterestRate = annualInterestRate(scanner.nextInt()) / 12;

        System.out.println("How many years you want to pay?");
        int yearsToPay = totalNumbersOfDays(scanner.nextInt());

        double presentValue = presentValueCalculatorFormulaMetod(monthlyPayout,expectedInterestRate,yearsToPay);
        System.out.printf("The annuity of present value would be: $%,.2f%n", presentValue);

    }
    // - (n) Number of Monthly Payments:
    public static int loanLengthInYears(int loanlength) {
        return loanlength * 12;
    }
    //   - (i) Monthly Interest Rate:
    public static double monthlyInterestRate(double interestRate) {
        return interestRate / 12;
    }
    //- (r) Annual Interest Rate:
    public static double annualInterestRate(double interestRate) {
        return interestRate / 100;
    }
    //- (M) Monthly Payment:
    public static double monthlyPaymentFormulaMethod(int principal, double monthlyInterestRate, int numberOfMonthlyPayments) {
        return principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfMonthlyPayments)) / (Math.pow((1 + monthlyInterestRate), numberOfMonthlyPayments) - 1);
    }
    public static double totalInterest(double monthlyPayment, int n, double P) {
        return (monthlyPayment * n) - P;
    }
    public static int totalNumbersOfDays(int daysCount){
        return daysCount * 12;
    }
    public static double formulaMethod(int initialDeposit, double annualInterestRate, int numbersOfDays, int numberOfYears){
        return initialDeposit * Math.pow(1 + (annualInterestRate / numbersOfDays),(numbersOfDays * numberOfYears));
    }
    public static double totalInterestEarned(double futureValue, int initialDeposit){
        return futureValue - initialDeposit;
    }

    public static double presentValueCalculatorFormulaMetod(double payment, double interest,int numberOfPayments){
        return payment * (((1 - Math.pow(1 + interest,-numberOfPayments)) / interest));
    }
}





