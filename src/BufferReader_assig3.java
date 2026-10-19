import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader_assig3 {
    private static Object reader;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT Score: ");
        int nsat = Integer.parseInt(reader.readLine());

        System.out.print("Enter Parents' Monthly Salary: ");
        double salary = Double.parseDouble(reader.readLine());

        System.out.print("Enter Entrance Exam Score: ");
        int entrance = Integer.parseInt(reader.readLine());

        boolean rejected = (salary > 10000) || (nsat < 90) || (entrance < 85);
        boolean accepted = !rejected && (salary <= 3500) && ((nsat + entrance) / 2.0 >= 91);

        if (rejected) {
            System.out.println("Rejected");
        } else if (accepted) {
            System.out.println("Accepted");
        } else {
            System.out.println("For Further Study");
        }

    }
}