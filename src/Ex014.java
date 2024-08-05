//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        String valorA = scanner.nextLine();
        System.out.println("Digite o valor B: ");
        String valorB = scanner.nextLine();
        String valorAux = valorA;
        System.out.println("Valor A: " + valorA + "\nValor B: " + valorB);
        valorA = valorB;
        valorB = valorAux;
        System.out.println("          |           ");
        System.out.println("          V           ");
        System.out.println("Valor A: "+ valorA + "\nValor B: " + valorB);
    }
}
