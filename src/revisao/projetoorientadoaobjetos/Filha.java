package revisao.projetoorientadoaobjetos;

import javax.swing.*;

public class Filha {

    public static void main(String[] args) {
        Mae filho = new Mae();

        filho.aluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
        filho.np1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da np1"));
        filho.np2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da np2"));

        double media = (filho.np1+filho.np2)/2;

        System.out.println("O aluno: "+filho.aluno);
        System.out.println("O aluno: "+media);
    }
}
