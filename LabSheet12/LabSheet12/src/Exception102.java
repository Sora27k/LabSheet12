import javax.swing.*;

public class Exception102 {
    public static void main(String[] args) {
        int number = 0;
        boolean is_loop = true;

        while (is_loop) {
            try {
                number = Integer.parseInt(JOptionPane.showInputDialog(
                        "Input an integer"));
                is_loop = false;
            } catch (NumberFormatException err) {
                JOptionPane.showConfirmDialog(null,
                        "Error: " + err.getMessage(),
                        "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showConfirmDialog(null,
                "Inputted number: "+ number);
    }
}
