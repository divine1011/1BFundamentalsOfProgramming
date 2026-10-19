import java.util.Scanner;
import java.util.InputMismatchException;

public class Scanner_assig2 {
    public static void main(String[] args) {
        Scanner readSalary = new Scanner(System.in);
        double hourlyPayRate;
        double hoursWorked;

        try {
            System.out.print("Enter your hourly pay: ");
            hourlyPayRate = readSalary.nextDouble();

            System.out.print("Enter your hours worked: ");git
            hoursWorked = readSalary.nextDouble();

            double grossPay = hourlyPayRate * hoursWorked;

            if (grossPay <= 2000.00) {
                System.out.println("Your gross pay is: " + grossPay +
                        ". The withholding tax amounts to " + (grossPay * 0.10) +
                        ". Your net pay is " + (grossPay - grossPay * 0.10));
            } else if (grossPay <= 4000.00) {
                System.out.println("Your gross pay is: " + grossPay +
                        ". The withholding tax amounts to " + (grossPay * 0.12) +
                        ". Your net pay is " + (grossPay - grossPay * 0.12));
            } else if (grossPay <= 10000.00) {
                System.out.println("Your gross pay is: " + grossPay +
                        ". The withholding tax amounts to " + (grossPay * 0.15) +
                        ". Your net pay is " + (grossPay - grossPay * 0.15));
            } else {
                System.out.println("Your gross pay is: " + grossPay +
                        ". The withholding tax amounts to " + (grossPay * 0.20) +
                        ". Your net pay is " + (grossPay - grossPay * 0.20));
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please try again.");
        } finally {

        }
    }
}

