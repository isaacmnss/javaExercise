//13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        if (idade >= 18){
            System.out.println(nome+": "+ idade+" anos,"+" maior de idade.");
        }else System.out.println(nome+": "+ idade+" anos,"+" menor de idade.");
    }
}
