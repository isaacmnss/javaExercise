import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int valorA = scanner.nextInt();
        System.out.println("Digite um número inteiro");
        int valorB = scanner.nextInt();
        if (valorA == valorB){
            int valorC = valorA + valorB;
            System.out.println(valorC);
        }else{
            int valorC = valorA * valorB;
            System.out.println(valorC);
        };
    }
}
