//12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
// conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago.
// Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//
//Tabela de Código de Condições de Pagamento
//
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        double valorFinal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.println("Selecione a forma de pagamento\n1-Dinheiro\n2-PIX\n3-Cartão");
        int formaDePagamento = scanner.nextInt();
        switch (formaDePagamento){
            case 1:
                valorFinal = valorProduto - valorProduto *0.15;
                break;
            case 2:
                valorFinal = valorProduto - valorProduto *0.15;
                break;
            case 3:
                System.out.println("Digite a quantidade de parcelas em que deseja pagar: (apenas o número, de 1 à 6)");
                int quantidadeParcelas = scanner.nextInt();
                if (quantidadeParcelas == 1 ){
                    valorFinal = valorProduto - valorProduto * 0.1;
                }else if (quantidadeParcelas == 2){
                    valorFinal = valorProduto;
                }else if (quantidadeParcelas >= 3 && quantidadeParcelas <= 6){
                    valorFinal = valorProduto + valorProduto * 0.1;
                }else System.out.println("Digite um número válido");
                break;
            default:
                System.out.println("Digite uma opção válida");
                break;
        }
        System.out.println("Valor à ser pago: R$"+ valorFinal);
    }
}
