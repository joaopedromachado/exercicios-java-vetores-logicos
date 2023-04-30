package exercicio09;

import java.util.ArrayList;
import java.util.List;

public class GuardadorPessoas {

    List<Pessoa> pessoas;

    public GuardadorPessoas(){
        pessoas = new ArrayList<>();
    }

    public void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void printAlunosAprovados(){
        pessoas.stream().filter(pessoa -> calcMediaNota(pessoa) >= 6.0).forEach(pessoa -> System.out.println(pessoa.getName()));
    }

    public double calcMediaNota(Pessoa pessoa) {
        return (pessoa.getN1() + pessoa.getN2()) / 2;
    }
}
