package aula03;

import javax.swing.*;

public class Tarefa1 {

    public static void main(String[] args) {

        String nome;
        double nota1;
        double nota2;
        double media;

        nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota2"));
        media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nNota1: " + nota1 + "\nNota2: " + nota2);
        JOptionPane.showMessageDialog(null, "Média: " + media);

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado com a média:  " + media);
        } else if (media < 3) {
            JOptionPane.showMessageDialog(null, "Reprovado com a média:  " + media);
        } else if (media >= 3 && media <= 6.9) {
            JOptionPane.showMessageDialog(null, "Exame final com a média:  " + media);
        }

    }
}
