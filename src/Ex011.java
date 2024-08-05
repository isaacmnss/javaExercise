
//11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
// imprima na tela o nome do aluno ese o aluno foi aprovado ou reprovado.
// Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a nota 4: ");
        double nota4 = scanner.nextDouble();
        double media = (nota1+nota2+nota3+nota4)/4;
        if (media >= 7){
            System.out.println("NOME: "+nome+"\nMÉDIA: "+media+"\nSITUAÇÃO: Aprovado");
        }else System.out.println("NOME: "+nome+"\nMÉDIA: "+media+"\nSITUAÇÃO: Reprovado");
    }
}
