package aula04.sistema.bancario;

public class Conta {

    //Atributos
    int numero;
    double saldo;
    double limite;
    double salario;

    //Métodos
    /*Métdo de saque*/
    void saque(double valor) {
        double novoSaldo = this.saldo - valor;
        this.saldo = novoSaldo;
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    /*public double lucro() {
        this.saldo += (this.saldo * 0.10);
        return this.saldo;
    }*/
    void rendimento(double valorRendimento) {
        double novosaldo = valorRendimento * this.saldo / 100 + this.saldo;
//        double novosaldo = valorRendimento * 10 / 100;
        this.saldo = novosaldo;
    }
}
