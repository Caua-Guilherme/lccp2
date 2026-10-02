package Exercicios_Ayla.Exercicio1;

import java.util.Scanner;

public class Questão8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("digite a sua cidade");
        String cidade = ler.nextLine();

        System.out.println("Oi " + nome + " Que legal saber que você é da cidade " + cidade);
    }
}
