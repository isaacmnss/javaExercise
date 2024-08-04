//Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
// deverá somar os dois valores,caso contrário devera multiplicar A por B. Ao final de qualquer
// um dos cálculos deve-se atribuir o resultado a uma variável C imprimir seu valor na tela.

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int valorA = scanner.nextInt();
        System.out.println("Digite um número inteiro");
        int valorB = scanner.nextInt();
        if (valorA == valorB){
            int valorC = valorA + valorB;
            System.out.println(valorC);
        }else{
            int valorC = valorA * valorB;
            System.out.println(valorC);
        };
    }
}
