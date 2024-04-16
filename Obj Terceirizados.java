package enti;

public class terceirizado extends funcionario {

    public terceirizado(String nome, double salario, double valorH) {
        super(nome, salario, valorH);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()*1.1;
    }

    @Override
    public String toString() {
        return "teste2{" +
                "Nome='" + nome + '\'' +
                ", Valor=" + salario +
                ", valor da Hora=" + valorH +
                ", valor pra receber="+calcularSalario()+'}';

    }

}
