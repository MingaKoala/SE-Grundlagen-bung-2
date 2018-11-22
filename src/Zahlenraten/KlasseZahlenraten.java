package Zahlenraten;

import javax.swing.*;
import java.util.Random;

public class KlasseZahlenraten {
    public static void main(String[] args) {

        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min; // Er bewirkt das eine zufällige Zahl angezeigt wird //

        if (zufallszahl % 2 ==0) {
            JOptionPane.showMessageDialog(null, "Ist Gerade");
        }

            else {
                JOptionPane.showMessageDialog(null,"Ist Ungerade");

            }

            String Benutzer = JOptionPane.showInputDialog("Geben Sie Bitte eine Ganzzahlt zwischen 1 und 10 ein");





        }





    }






