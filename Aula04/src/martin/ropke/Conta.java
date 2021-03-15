package martin.ropke;


public class Conta {
    //Atributos da classe

    Cliente cliente;
    double saldo;
    int numero;

    //Métodos sa Classe
    void depositar(double valor){

        // Adiciona valor ao saldo
        this.saldo += valor;
    }
    boolean sacar(double valor){

        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;

        }
            return false;
    }


    boolean transferirDinheiro(Conta destino , double valor){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    void visualizarSaldo(){

        // Exibe valor do saldo da conta
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}
