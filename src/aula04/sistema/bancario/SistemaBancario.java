package aula04.sistema.bancario;

import javax.swing.*;

public class SistemaBancario {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = JOptionPane.showInputDialog(null, "Cliente: ");

        Conta conta = new Conta();
        conta.saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo: "));

        //imprimir as informações
        JOptionPane.showMessageDialog(null, cliente.nome + "\n" + conta.saldo);

        conta.saque(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de saque: ")));
        JOptionPane.showMessageDialog(null, "Saldo após saque: " + conta.saldo);

        conta.deposita(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito: ")));
        JOptionPane.showMessageDialog(null, "Saldo após depósito: " + conta.saldo);

//        Criar metodo para adicionar o valor de 10% no saldo
//        JOptionPane.showMessageDialog(null, "Lucro: " + conta.lucro());
        conta.rendimento(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do rendimento: ")));
        JOptionPane.showMessageDialog(null, "Saldo após lucro: " + conta.saldo);


    }
}
