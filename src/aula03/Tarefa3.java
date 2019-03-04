// Desenvolva um algoritmo que receba três valores a, b, c e coloque-os em ordem decrescente.

package aula03;

import javax.swing.*;

public class Tarefa3 {

    public static void main(String[] args) {

        int a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro número:"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo número:"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Terceiro número:"));

        if (a > b) {
            if (b > c) {
                JOptionPane.showMessageDialog(null, "Ordem decrescente\n" + a + "\n" + b + "\n" + c);
            } else if (a > c) {
                JOptionPane.showMessageDialog(null, "Ordem decrescente\n" + a + "\n" + c + "\n" + b);
            } else {
                JOptionPane.showMessageDialog(null, "Ordem decrescente\n" + c + "\n" + a + "\n" + b);
            }
        } else if (b > c) {
            if (a > c) {
                JOptionPane.showMessageDialog(null, "Ordem decrescente\n" + b + "\n" + a + "\n" + c);
            } else {
                JOptionPane.showMessageDialog(null, "Ordem decrescente\n" + b + "\n" + c + "\n" + a);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ordem decrescente\n" + c + "\n" + b + "\n" + a);
        }
    }
}
