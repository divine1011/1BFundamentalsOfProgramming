import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader_assig4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height (cm): ");
        int height = Integer.parseInt(reader.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.print("Enter Recommendation (C/N): ");
        String citizenship = reader.readLine().trim().toUpperCase();

        System.out.print(" Enter Recommendation (R/N): ");
        String recommend = reader.readLine().trim().toUpperCase();

        boolean accepted;
        if (recommend.equals("R")) {
            accepted = true;
        } else {
            accepted = (height >= 200) &&
                    (age >= 21 && age <= 25) &&
                    citizenship.equals("C");
        }

        System.out.println("\n" + (accepted ? "ACCEPTED" : "REJECTED"));
    }
}