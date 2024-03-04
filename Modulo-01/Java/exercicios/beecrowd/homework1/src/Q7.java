import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        a *= 2;
        b *= 3;
        c *= 5;

        double media = (a + b + c) / 10;
        System.out.printf("MEDIA = %.1f%n", media);


    }
}
