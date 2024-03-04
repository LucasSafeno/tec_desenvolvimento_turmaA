import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double n = 3.14159;
        double a = n * (raio * raio);

        System.out.printf("A=%.4f%n", a);
    }
}
