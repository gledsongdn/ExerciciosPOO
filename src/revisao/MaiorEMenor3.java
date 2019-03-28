package revisao;

import javax.swing.*;

public class MaiorEMenor3 {

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º número"));

        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2º número"));

        int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 3º número"));

        if ((n1 > n2) && (n2 > n3)) {
            System.out.println(n1 + " é maior" + "\n" + n3 + " é o menor");
        }
        if ((n1 > n3) && (n3 > n2)) {
            System.out.println(n1 + " é maior" + "\n" + n2 + " é o menor");
        }
        if ((n2 > n1) && (n1 > n3)) {
            System.out.println(n2 + " é maior" + "\n" + n3 + " é o menor");
        }
        if ((n2 > n3) && (n3 > n1)) {
            System.out.println(n2 + " é maior" + "\n" + n1 + " é o menor");
        }
        if ((n3 > n1) && (n1 > n2)) {
            System.out.println(n3 + " é maior" + "\n" + n2 + " é o menor");
        }
        if ((n3 > n2) && (n2 > n1)) {
            System.out.println(n3 + " é maior" + "\n" + n1 + " é o menor");
        }

    }
}
