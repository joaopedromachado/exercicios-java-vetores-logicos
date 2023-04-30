package exercicio01;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[10];
        int negativos;
        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();
        for ( int i = 0 ; i < N ; i++){
            negativos = sc.nextInt();
            if (negativos < 0){
                number[i] = negativos;
            } else {
                System.out.println("Não é negativo");
            }
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int j = 0 ; j < N ; j++){
            System.out.println(number[j]);
        }

    }
}
