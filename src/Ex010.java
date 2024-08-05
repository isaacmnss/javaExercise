import java.util.Scanner;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
public class Ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média das notas: "+media);
    }
}
