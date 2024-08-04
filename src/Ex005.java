// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
// calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
// (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário mínimo ");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o seu salário ");
        double salario = scanner.nextDouble();
        double salarios = salario/salarioMinimo;
        System.out.println( salarios+ " salários.");
    }
}
