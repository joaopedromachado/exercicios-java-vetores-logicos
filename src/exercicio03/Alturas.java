package exercicio03;

import java.util.Scanner;

public class Alturas {


    public static void main(String[] args) {
        GuardadorPessoas guardador = new GuardadorPessoas();
        Scanner sc = new Scanner(System.in);
        int N;
        String name;
        int age;
        double height;


        System.out.print("Quantas pessoas serao digitadas? ");
        N = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i < N ; i++){
            System.out.printf("Dados da %da pessoa:%n", i+1);
            name = sc.nextLine();
            age = sc.nextInt();
            height = sc.nextDouble();
            sc.nextLine();
            guardador.addPessoa(new Pessoa(name, age, height));
        }

        guardador.printPessoas();
//        guardador.calcMediaHeight();
        System.out.printf("Altura media: %.2f%n", guardador.calcMediaHeight());
        System.out.println(guardador.calcMenoresIdade(N));



    }
}
