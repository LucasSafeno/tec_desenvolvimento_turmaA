import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        double salario = input.nextDouble();
        double vendas = input.nextDouble();


        double comissao = vendas * 0.15;
        double total = salario + comissao;
        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
