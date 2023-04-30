package exercicio06;

import java.util.Scanner;

public class Soma_Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vA;
        int[] vB;
        int N;
        int valorResultante;

        System.out.print("Quantos valores vai ter cada vetor? ");
        N = sc.nextInt();
        vA = new int[N];
        vB = new int[N];

        System.out.println("Digite os valores do vetor A: ");
        for ( int i = 0 ; i < N ; i++ ){
            vA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for ( int j = 0 ; j < N ; j ++ ){
            vB[j] = sc.nextInt();
        }

        System.out.println("VALOR RESULTANTE: ");
        for ( int x = 0 ; x < N ; x ++ ){
            valorResultante = vA[x] + vB[x];
            System.out.println(valorResultante);
        }
    }
}
