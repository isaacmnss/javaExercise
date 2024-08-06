//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro valor booleano (true/false): ");
        boolean valor1 = scanner.nextBoolean();


        System.out.print("Digite o segundo valor booleano (true/false): ");
        boolean valor2 = scanner.nextBoolean();


        if (valor1 && valor2) {
            System.out.println("Ambos os valores são VERDADEIRO.");
        }

        else if (!valor1 && !valor2) {
            System.out.println("Ambos os valores são FALSO.");
        }

        else {
            System.out.println("Os valores não são ambos VERDADEIRO nem ambos FALSO.");
        }

        scanner.close();
    }
}
