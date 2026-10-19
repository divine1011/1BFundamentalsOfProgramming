import javax.swing.JOptionPane;

public class JOption_assig3{
    public static void main(String[] args) {
        int nsat = Integer.parseInt(
                JOptionPane.showInputDialog("Enter NSAT Score:"));
        double salary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter Parents' Monthly Salary:"));
        int entrance = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Entrance Exam Score:"));

        boolean rejected = (salary > 10000) || (nsat < 90) || (entrance < 85);
        boolean accepted = !rejected && (salary <= 3500) && ((nsat + entrance) / 2.0 >= 91);

        String result;
        if (rejected) {
            result = "Rejected";
        } else if (accepted) {
            result = "Accepted";
        } else {
            result = "For Further Study";
        }

        JOptionPane.showMessageDialog(null, "Application Status: " + result);
    }
}