package Aula02;

import java.util.Random;

import org.graalvm.compiler.hotspot.nodes.profiling.RandomSeedNode;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Basico03 {
    //Estrutura de repetição
    public static void main(String[] args) {
        int limite = 10;
        int contador;
        for(contador = 0; contador < 10; contador++){
            System.out.println("Contador atual:" + contador);
        }

        //Cria um objeto que sorteia coisas aleatórias
        Random sorteador = new Random();
        int numero = sorteador.nextInt(1000);
        System.out.println("Numero sorteado:" + numero);
        int senha = 123456;
        int tentativas = 0, chute;
        chute = sorteador.nextInt(999999);
        while(chute != senha){
            tentativas++;
            System.out.println("Ainda não quebramos:" + chute);
            System.out.println("Tentativa:" + tentativas);
            chute = sorteador.nextInt(999999);
        } 
        System.out.println("Parabens! Quase um craker!");
        System.out.println("Levou apenas:" + tentativas);
    }
}
