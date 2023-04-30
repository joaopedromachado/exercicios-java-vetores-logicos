package exercicio09;

public class Pessoa {
    private String name;
    private double n1;

    private double n2;

    Pessoa(String name, double n1, double n2){
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nIdade: %d%nAltura: %.2f%n", this.name, this.n1, this.n2);
    }
}