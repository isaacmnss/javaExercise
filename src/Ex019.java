// Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Ex019 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("Tabuada do "+ i);
            for (int j = 1; j < 11; j++) {
                System.out.println(i +" X "+j+" = "+ i*j );
            }
            System.out.println(" ");
        }
    }
}
