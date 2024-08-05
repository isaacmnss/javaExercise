/*
15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
 meses e dias essa pessoa ja viveu. Considere o ano com 365 dias e o mês com 30 dias.

        (Ex: 5 anos, 2 meses e 15 dias de vida)
*/

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        final int ANO_ATUAL = 2024;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento");
        int anoNascimento = scanner.nextInt();
        int anos = ANO_ATUAL - anoNascimento;
        int diasVividos = anos * 365;
        int anosVividos = diasVividos/ 365;
        int diasRestantes = diasVividos % 365;
        int mesesVividos = diasRestantes/30;
        diasRestantes = diasRestantes % 30;
        System.out.println(anosVividos + " anos, " + mesesVividos + " meses e " + diasRestantes + " dias de vida");
        scanner.close();
    }
}
