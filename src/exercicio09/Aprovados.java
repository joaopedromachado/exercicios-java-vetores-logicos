package exercicio09;

import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {
        GuardadorPessoas guardador = new GuardadorPessoas();
        Scanner sc = new Scanner(System.in);
        int N;
        String name;
        double n1;
        double n2;


        System.out.print("Quantas pessoas serao digitadas? ");
        N = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i < N ; i++){
            System.out.printf("Dados do %do aluno:%n", i+1);
            name = sc.nextLine();
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            sc.nextLine();
            guardador.addPessoa(new Pessoa(name, n1, n2));
        }

        guardador.printAlunosAprovados();

    }
}