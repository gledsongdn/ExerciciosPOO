package revisao;

import javax.swing.*;

public class OrdemDecrescente {

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º número"));

        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2º número"));

        int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 3º número"));

        if ((n1 > n2) && (n2 > n3)) {
            System.out.println("Ordem Crescente " + n1 + " " + n2 + " " + n3);
        }
        if ((n1 > n3) && (n3 > n2)) {
            System.out.println("Ordem Crescente " + n2 + " " + n1 + " " + n3);
        }
        if ((n2 > n1) && (n1 > n3)) {
            System.out.println("Ordem Crescente " + n1 + " " + n3 + " " + n2);
        }
        if ((n2 > n3) && (n3 > n1)) {
            System.out.println("Ordem Crescente " + n3 + " " + n1 + " " + n2);
        }
        if ((n3 > n1) && (n1 > n2)) {
            System.out.println("Ordem Crescente " + n2 + " " + n3 + " " + n2);
        }
        if ((n3 > n2) && (n2 > n1)) {
            System.out.println("Ordem Crescente " + n3 + " " + n2 + " " + n1);
        }
    }
}
