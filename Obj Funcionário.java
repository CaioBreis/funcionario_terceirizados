package enti;

public class funcionario {
    protected String nome;
    protected double salario;
    protected double valorH;

    public funcionario(String nome, double salario, double valorH) {
        this.nome = nome;
        this.salario = salario;
        this.valorH = valorH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorH() {
        return valorH;
    }

    public void setValorH(double valorH) {
        this.valorH = valorH;
    }

    public double calcularSalario() {
        return salario * valorH;
    }

    @Override
    public String toString() {
        return "teste{" +
                "Nome='" + nome + '\'' +
                ", Valor=" + salario +
                ", valor da Hora" + valorH +
                ", valor pra receber=" + calcularSalario() +
                '}';
    }
}
