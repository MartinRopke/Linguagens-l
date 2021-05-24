package br.maua.linked_test_drive;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<String> cidades = new LinkedList<>();
        cidades.add("Pallet");
        cidades.add("Veridian");
        cidades.add("Pewter");
        cidades.add("Cerulean");
        cidades.add("Celadon");
        cidades.add("Saffron");
        cidades.add("Ilhas Cinabar");

        System.out.println("Passa pelas cidades:");
        cidades.forEach(cidade -> System.out.println(cidade));

        cidades.add(5, "Safari Zone");
        cidades.remove(2);

        System.out.println("\nPassa pelas cidades:");
        cidades.forEach(cidade -> System.out.println(cidade));

        //Trabalhando com Iterator
        System.out.println("\nTrabalha com Iterator:");
        Iterator<String> iterator = cidades.iterator();
        //Navega pelos elementos do LinkedList usando o iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
