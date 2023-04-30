package exercicio02;

import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;
        int outroValor;
        int[] number = new int[10];
        int maior = 0;
        int j=0;

        System.out.println("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();
        for (int i = 0 ; i < N ; i++){
            outroValor = sc.nextInt();
            if (maior < outroValor){
                maior = outroValor;
                j= i;
                number[i] = maior;
            }
        }

        System.out.println(maior);
        System.out.println(j);
    }
}
