//22 - Faça um algoritmo que leia dois valores inteiros A e B.
// Imprima na tela o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.println("Digite o divisor: ");
        int divisor = scanner.nextInt();
        int resto = dividendo % divisor;
        int quociente = dividendo / divisor;
        System.out.println("Resto: "+resto);
        System.out.println("Quociente: "+quociente);
    }
}
