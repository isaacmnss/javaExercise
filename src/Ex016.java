//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos,
// determine se o triângulo é equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado");
        int lado1 = scanner.nextInt();
        System.out.println("Digite o valor do segundo lado");
        int lado2 = scanner.nextInt();
        System.out.println("Digite o valor do terceiro lado");
        int lado3 = scanner.nextInt();
        scanner.close();
        if (lado1 + lado2 < lado3 || lado2 + lado3 < lado1 || lado3 + lado1 < lado2){
            System.out.println("Estes valores não representam um triângulo");
        } else if ( lado1 == lado2  && lado1 == lado3) {
            System.out.println("Este é um triângulo equilátero");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("Este é um triângulo escaleno");
        } else System.out.println("Este é um triângulo isóceles");
    }
}
