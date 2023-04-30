package exercicio04;

import java.util.Scanner;

public class Numeros_Pares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int contadorPares;
        int[] numerosPares;

        System.out.println("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();
        numerosPares = new int[N];
        for (int i = 0 ; i < N ; i++){
            contadorPares = sc.nextInt();
            numerosPares[i] = contadorPares;
        }

        for (int j = 0; j < numerosPares.length; j++){
            if(numerosPares[j] % 2 == 0){
                System.out.print(numerosPares[j] + " ");
            }
        }

    }

}
