import javax.swing.JOptionPane;

public class JOption_assig4 {
    public static void main(String[] args) {

        int height = Integer.parseInt(
                JOptionPane.showInputDialog("Enter height (cm):"));

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age:"));

        String citizenship = JOptionPane.showInputDialog("Enter Recommendation (C/N):")
                .trim().toUpperCase();

        String recommend = JOptionPane.showInputDialog("Enter Recommendation (R/N):")
                .trim().toUpperCase();

        boolean accepted;
        if (recommend.equals("R")) {
            accepted = true;
        } else {
            accepted = (height >= 200) &&
                    (age >= 21 && age <= 25) &&
                    citizenship.equals("C");
        }

        String result = accepted ? "ACCEPTED" : "REJECTED";
        JOptionPane.showMessageDialog(null, result);
    }
}
