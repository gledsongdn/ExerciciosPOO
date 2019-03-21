package aula04.sistema.bancario;

public class Conta {

    //Atributos
    int numero;
    double saldo;
    double limite;
    double salario;
    double valorSaque;

    //Métodos
    /*Métdo de saque*/
    void saque(double valor){
        double novoSaldo = this.saldo - valor;
        this.saldo = novoSaldo;
    }

    void deposita(double valor){
        double novoSaldo = this.saldo + valor;
        this.saldo = novoSaldo;
    }
}
