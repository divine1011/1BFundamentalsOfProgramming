import java.util.Scanner;

public class Scanner_assig4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height (cm): ");
        int height = scanner.nextInt();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Recommendation (C/N): ");
        String citizenship = scanner.next();
        System.out.print("Enter Recommendation (R/N): ");
        String recommend = scanner.next();

        boolean accepted;
        if (recommend.equals("R")) {
            accepted = true;
        } else {
            accepted = (height >= 200) &&
                    (age >= 21 && age <= 25) &&
                    citizenship.equals("C");
        }

        System.out.println("\n" + (accepted ? "ACCEPTED" : "REJECTED"));
        scanner.close();
    }
}
