package martin.ropke;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    // Cria um objeto do tipo conta
        Conta c1;
        //Instância um objeto conta
        c1 = new Conta();

        //Pede para conta exibir o saldo
        c1.visualizarSaldo();

        //Modificar o saldo
        c1.saldo = 100;

        c1.visualizarSaldo();

        //Cria um novo objeto de tipo Conta
        Conta c2 = new Conta();
        c2.saldo = 123.0;

        c1.depositar(300);
        c2.depositar(100);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

//        if(c1.sacar(4000)){
//            System.out.println("Hoje tem playstation!!");
//        } else{
//            System.out.println("Deu ruim!");
//        }

        if(c1.transferirDinheiro(c2, 250)){
            System.out.println("Transferencia realizada com sucesso!");
        } else{
            System.out.println("Não foi possivel realizar a transferencia!");
        }

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        c1.cliente = new Cliente();
        c2.cliente = new Cliente();


        System.out.println("Nome do cliente:" +c1.cliente.nome);
        System.out.println("Nome do cliente:"+c2.cliente.nome);

        System.out.println("c1" + c1.toString());





    }
}
