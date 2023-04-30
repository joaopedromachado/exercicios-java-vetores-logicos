package exercicio07;

import java.util.Scanner;

public class Abaixo_Da_Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor;
        int N;
        double num, media = 0.0, soma = 0.0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();
        vetor = new double[N];
        for ( int i = 0 ; i < N ; i++ ) {
            System.out.print("Digite um numero: ");
            num = sc.nextDouble();
            vetor[i] = num;
            soma += vetor[i];
            media = soma / N;
        }

        System.out.print("MEDIA DO VETOR = " + media);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
        for ( int j = 0 ; j < vetor.length ; j++) {
            if (vetor[j] < media){
                System.out.println(vetor[j]);
            }
        }
    }
}
