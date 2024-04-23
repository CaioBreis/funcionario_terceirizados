package main;

    import enti.fucionario;
    import enti.terceirizado;

    import java.util.Scanner;

    public class empresa {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Número de funcionários:");
            int numFuncionarios = sc.nextInt();
            sc.nextLine(); // Consumir quebra de linha

            fucionario[] vet = new fucionario[numFuncionarios];

            for (int i = 0; i < vet.length; i++) {
                System.out.println("Digite o nome:");
                String nome = sc.nextLine();
                System.out.println("Digite o Valor:");
                double salario = sc.nextDouble();
                System.out.println("Valor da Hora:");
                double hora = sc.nextDouble();
                vet[i] = new fucionario(nome, salario, hora);
                sc.nextLine(); // Consumir quebra de linha
            }

            for (int i = 0; i < vet.length; i++) {
                System.out.println(vet[i]);
                System.out.println(" ");
            }

            System.out.println("Número de funcionários terceirizados:");
            int numTerceirizados = sc.nextInt();
            sc.nextLine(); // Consumir quebra de linha

            terceirizado[] vet2 = new terceirizado[numTerceirizados];

            for (int i = 0; i < vet2.length; i++) {
                System.out.println("Digite o nome:");
                String nome = sc.nextLine();
                System.out.println("Digite o valor:");
                double salario = sc.nextDouble();
                System.out.println("valor da Hora:");
                double hora = sc.nextDouble();
                vet2[i] = new terceirizado(nome, salario, hora);
                sc.nextLine(); // Consumir quebra de linha
            }

            for (int i = 0; i < vet2.length; i++) {
                System.out.println(vet2[i]);
                System.out.println(" ");
            }
        }
    }
