import java.util.Scanner;

// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
public class Ex008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n3 = scanner.nextInt();
        if (n1 > n2 && n1 > n3){
            System.out.println(n1);
            if (n2 > n3){
                System.out.println(n2);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n2);
            }

        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
            if (n1 > n3){
                System.out.println(n1);
                System.out.println(n3);
            }else {
                System.out.println(n3);
                System.out.println(n1);
            }

        }else {
            System.out.println(n3);
            if (n1 > n2){
                System.out.println(n1);
                System.out.println(n2);
            } else {
                System.out.println(n2);
                System.out.println(n1);
            }
        }
    }
}
