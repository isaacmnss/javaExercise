//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
// Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit");
        double TemperaturaF = scanner.nextDouble();
        scanner.close();
        double TemperaturaC = (5*(TemperaturaF -32)/9);
        System.out.println(TemperaturaF+"°F = "+TemperaturaC+"°C");
    }
}
