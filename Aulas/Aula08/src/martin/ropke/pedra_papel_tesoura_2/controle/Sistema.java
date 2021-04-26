package martin.ropke.pedra_papel_tesoura_2.controle;
import java.util.Random;
import java.util.Scanner;

import martin.ropke.pedra_papel_tesoura_2.model.Jogada;
import martin.ropke.pedra_papel_tesoura_2.model.Jogador;
import martin.ropke.pedra_papel_tesoura_2.model.classico.Papel;
import martin.ropke.pedra_papel_tesoura_2.model.classico.Pedra;
import martin.ropke.pedra_papel_tesoura_2.model.classico.Tesoura;

public class Sistema {
    private Jogador player1, player2;
    private Scanner scanner;
    private final Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};
    public Sistema(){
        scanner = new Scanner(System.in);
        inicializarJogadores();
    }
    public void run(){
   
        boolean continuar = true;
        do{
            System.out.println(player1.getNome() + " vs "+player2.getNome());
            player1.setJogada(escolherJogada());
            player2.setJogada(sortearJogada());
            System.out.println("Jogada Player1:"+player1.getJogada());
            System.out.println("Jogada Player2:"+player2.getJogada());
            System.out.println("Resultado:"+player1.getJogada().verificarResultado(player2.getJogada()));
        }while(continuar);
    }
    private Jogada sortearJogada(){
        return jogadas[new Random().nextInt(jogadas.length)];
    }
    private Jogada escolherJogada(){
        System.out.println("Informe sua jogada:\n0 - Pedra\n1 - Papel\n2 - Tesoura");
        int escolha = scanner.nextInt();
        
        return jogadas[escolha];
    }
    private void inicializarJogadores() {
        System.out.println("Informe um nome para o jogador 1:");
        String nome = scanner.next();
        this.player1 = new Jogador(nome, true);
        this.player2 = new Jogador("NPC");
    }
}
