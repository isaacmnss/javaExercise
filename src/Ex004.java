//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int antecessor = num -1;
        int sucessor =  num + 1;
        System.out.println("Antecessor: " +antecessor);
        System.out.println("Sucessor: "+ sucessor);
    }
}
