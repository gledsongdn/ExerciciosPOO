// Desenvolva um algoritmo que receba três valores a, b, c e exiba o maior e o menor dos três valores.

package aula03;

import javax.swing.*;

public class Tarefa5 {

    public static void main(String[] args) {

        int a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro número:"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo número:"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Terceiro número:"));

        if ((a > b) && (a > c) && (b > c)) {
            JOptionPane.showMessageDialog(null, "Maior: " + a + "\nMenor: " + c);
        } else if ((a > b) && (a > b) && (c > b)) {
            JOptionPane.showMessageDialog(null, "Maior: " + a + "\nMenor: " + b);
        } else if ((b > a) && (b > c) && (a > c)) {
            JOptionPane.showMessageDialog(null, "Maior: " + b + "\nMenor: " + c);
        } else if ((b > a) && (b > c) && (c > a)) {
            JOptionPane.showMessageDialog(null, "Maior: " + b + "\nMenor: " + a);
        } else if ((c > a) && (c > b) && (a > b)) {
            JOptionPane.showMessageDialog(null, "Maior: " + c + "\nMenor: " + b);
        } else {
            JOptionPane.showMessageDialog(null, "Maior: " + c + "\nMenor: " + a);
        }
    }
}
