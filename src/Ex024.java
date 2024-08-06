//22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
// sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem
// a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
//
//        Fórmula: distância = tempo x velocidade.
//        litros usados = distância / 12.

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        final int KM_POR_LITRO = 12;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tempo gasto (em h): ");
        int tempoGasto = scanner.nextInt();
        System.out.println("Digite a velocidade média (em km): ");
        int velocidadeMedia = scanner.nextInt();
        int distancia = tempoGasto * velocidadeMedia;
        double litros = distancia /KM_POR_LITRO;
        System.out.println("Tempo gasto: "+tempoGasto+"h\nVelocidade Média: "+velocidadeMedia+"km\nDistância percorrida: "+distancia+"km\nQuantidade de litros:"+litros+"l");
    }
}
