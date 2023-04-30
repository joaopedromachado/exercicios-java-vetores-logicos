package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class GuardadorPessoas implements CalculateAverage {

    List<Pessoa> pessoas;

    public GuardadorPessoas(){
        pessoas = new ArrayList<>();
    }

    public void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void printPessoas(){
        pessoas.forEach(pessoa -> {
            System.out.println(pessoa);
        });
    }

    public double calcMenoresIdade(int n){
        double porcentagemMenoresDe16 = 0.0;
        double numeroDeMenores = 0.0;
        for (Pessoa pessoa : pessoas){
            if (pessoa.getAge() <= 16){
                numeroDeMenores++;
                porcentagemMenoresDe16 = (numeroDeMenores / n) * 100.0;
            }
        }
        return porcentagemMenoresDe16;
    }

    @Override
    public double calcMediaHeight() {
        double totalHeight = 0.0;
        for ( Pessoa pessoa : pessoas) {
            totalHeight += pessoa.getHeight();
        }
        return totalHeight / pessoas.size();
    }
}
