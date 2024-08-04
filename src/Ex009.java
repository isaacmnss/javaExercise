//9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
//leia o seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:
//
//Fórmula do IMC = peso / (altura) ²
//
//Tabela Condições IMC
//
//Abaixo de 18,5   | Abaixo do peso
//
//Entre 18,6 e 24,9 | Peso ideal (parabéns)
//
//Entre 25,0 e 29,9 | Levemente acima do peso
//
//Entre 30,0 e 34,9 | Obesidade grau I
//
//Entre 35,0 e 39,9 | Obesidade grau II (severa)
//
//Maior ou igual a 40 | Obesidade grau III (mórbida)

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite a sua altura em cm: ");
        double altura = scanner.nextDouble()/ 100;
        System.out.println(altura);
        double imc = peso / (altura*altura);
        if (imc <= 18.5){
            System.out.println(imc+ " | ABAIXO DO PESO");
        } else if (imc > 18.5 && imc < 25) {
            System.out.println(imc+ " | PESO IDEAL");
        } else if (imc >= 25 && imc < 30) {
            System.out.println(imc+" | LEVEMENTE ACIMA DO PESO");
        } else if (imc >= 30 && imc < 35) {
            System.out.println(imc+" | OBESIDADE GRAU I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println(imc+" | OBESIDADE GRAU II (severa)");
        }else System.out.println(imc+" | OBESIDADE GRAU III (mórbida)");
        }
    }

