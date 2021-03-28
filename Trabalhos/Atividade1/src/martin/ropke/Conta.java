package martin.ropke;

import java.util.HashSet;

public class Conta {
    private static HashSet<Integer> idContas = new HashSet<>();
    private int idConta;
    private double saldo;
    private Usuario proprietario;

    public Conta(Usuario proprietario, double saldo){
        this.saldo = saldo;
        this.proprietario = proprietario;

        //Criação de um novo id com base no numero de contas existentes
        int novoId = idContas.size()+1;
        idContas.add(novoId);
        this.idConta = novoId;
        
    }

    //retorna o id da conta
    public int getId(){
        return this.idConta;
    }

    //retorna o saldo da conta
    public double getSaldo(){
        return this.saldo;
    }

    //retorna o proprietario da conta
    public Usuario getUsuario(){
        return this.proprietario;
    }

    //Adiciona valor ao saldo
    public void depositar(double valor){
        this.saldo += valor;
    }

    //retira valor do saldo se ele não for maior que o saldo
    public boolean sacar(double valor){

        if(valor <= this.saldo){
        this.saldo -= valor;
        return true;
    }
        return false;
    }

    @Override
    public String toString() {
        
        return "idConta:"+idConta+" Saldo:"+saldo+" proprietario:["+proprietario+"]";
    }
  

    
}
