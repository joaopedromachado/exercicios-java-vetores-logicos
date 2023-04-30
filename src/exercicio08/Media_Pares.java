package exercicio08;

import java.util.Scanner;

public class Media_Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int[] vetor;
        int num, soma=0, media=0, nPares=0;


        System.out.print("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();
        vetor = new int[N];

        for ( int i = 0 ; i < N ; i++ ) {
            num = sc.nextInt();
            vetor[i] = num;
            if (vetor[i] % 2 == 0) {
                nPares++;
                soma += vetor[i];
                media = soma / nPares;
            }
        }

        if (nPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.print("MEDIA DOS PARES = " + media);
        }
    }
}
