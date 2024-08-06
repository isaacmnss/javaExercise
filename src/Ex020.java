// 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        System.out.println("Tabuada do "+num);
        for (int i = 1; i < 11; i++) {
            System.out.println(num+" X "+i+" = "+num*i);
        }

    }
}
