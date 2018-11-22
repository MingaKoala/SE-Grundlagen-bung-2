import javax.swing.*;

public class SEG_UE1 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Bitte geben Sie ihren Namen ein");
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Alter eingeben"));
        if (alter >= 18) {

            JOptionPane.showMessageDialog(null, "Ist volljährig");

        } else {
            JOptionPane.showMessageDialog(null, "Ist nicht volljährig");

        }

    }
}
