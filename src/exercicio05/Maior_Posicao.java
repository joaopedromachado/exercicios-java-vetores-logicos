package exercicio05;

import java.util.Scanner;

public class Maior_Posicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] guardadorDeNumerosReais;
        int num;
        int maior = 0;
        int pos = 0;

        System.out.print("Quantos numeros voce vai digitar: ");
        int N = sc.nextInt();
        guardadorDeNumerosReais = new int[N];

        for ( int i = 0 ;  i < N ; i++ ) {
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            guardadorDeNumerosReais[i] = num;
        }

        for ( int j = 0 ; j < guardadorDeNumerosReais.length ; j++) {
            if (maior < guardadorDeNumerosReais[j]){
                maior = guardadorDeNumerosReais[j];
                pos = j;
            }
        }

        System.out.printf("MAIOR VALOR = %d%nPOSICAO DO MAIOR VALOR = %d%n", maior, pos);


    }
}
