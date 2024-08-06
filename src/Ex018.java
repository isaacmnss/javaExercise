import java.text.DecimalFormat;

// 18 - Sara tem 1,50m e cresce 2 centímetros por ano, enquanto Francisco tem 1,10m e cresce 3 centímetros por ano.
// Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
public class Ex018 {
    public static void main(String[] args) {
        int anos = 0;
        double alturaSara = 1.5;
        double alturaFrancisco =1.1;
        while ( alturaFrancisco < alturaSara){
            alturaFrancisco = alturaFrancisco +0.03;
            alturaSara = alturaSara + 0.02;
            anos++;
        }
        System.out.println("Se passaram "+ anos+" anos."+"\nFrancisco agora tem "+alturaFrancisco+"m e Sara "+alturaSara);
    }
}
