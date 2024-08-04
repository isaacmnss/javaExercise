//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida
// imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");

        int valorA =  scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int valorB =  scanner.nextInt();
        System.out.println("Digite o valor de C: ");
        int valorC =  scanner.nextInt();

        System.out.println("Valores: "+valorA +", "+valorB+", "+valorC);
        int somaAB = valorA + valorB;
        if ( somaAB < valorC)System.out.println("O valor de A + B é menor que C \n"+somaAB+"<"+valorC);
    }
}