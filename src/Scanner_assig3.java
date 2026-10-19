import java.util.Scanner;

public class Scanner_assig3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter NSAT Score: ");
        int nsat = input.nextInt();

        System.out.print("Enter Parents' Monthly Salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter Entrance Exam Score: ");
        int entrance = input.nextInt();

        boolean rejected = (salary > 10000) || (nsat < 90) || (entrance < 85);
        boolean accepted = !rejected && (salary <= 3500) && ((nsat + entrance) / 2.0 >= 91);

        if (rejected) {
            System.out.println("REJECTED");
        } else if (accepted) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("FOR FURTHER STUDY");
        }
        input.close();
    }
}
