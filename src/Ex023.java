// 23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
// valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
// Imprima na tela o salário líquido final.

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora aula: ");
        double horaAula = scanner.nextDouble();
        System.out.println("Quantas aulas deu esse mês: ");
        int qtdAulas = scanner.nextInt();
        System.out.println("Digite o percentual de desconto do INSS");
        double descontoINSS = scanner.nextDouble();
        double salarioBruto = horaAula * qtdAulas;
        double salarioLiquido = salarioBruto - (salarioBruto * (descontoINSS /100));
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
