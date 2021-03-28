package martin.ropke;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	
        //criação de 3 usuarios para testes

        //Criando scanner para entrada de dados
        Scanner input = new Scanner(System.in);

        //Criando usuario 1
        // System.out.println("Digite o nome do usuario: ");
        // String nome1 = input.nextLine();
        Usuario usuario1 = new Usuario("jorge", "12345", "usuario1@gmail.com");
        System.out.println(usuario1);
        //Criando conta do usuario 1
        Conta conta1 = new Conta(usuario1, 1000.00);
        System.out.println(conta1);

        // //Criando usuario2
        // String nome2 = input.nextLine();
        // Usuario usuario2 = new Usuario(nome2, "54321", "usuario2@gmail.com");
        // //Criando conta do usuario 2
        // Conta conta2 = new Conta(usuario2, 250.00);

        // //Criando usuario3
        // String nome3 = input.nextLine();
        // Usuario usuario3 = new Usuario(nome3, "00000", "usuario3@gmail.com");
        // //Criando conta do usuario 3
        // Conta conta3 = new Conta(usuario3, 3000.00);

        System.out.println(Transacoes.geradorQR(1, usuario1, 1000.0));
    }
}
