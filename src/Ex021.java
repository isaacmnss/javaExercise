// 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

import java.util.Random;

public class Ex021 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(0, 100);
        System.out.println(randomInt);
    }
}
