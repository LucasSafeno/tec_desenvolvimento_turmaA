import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            double a = input.nextDouble();
            double b = input.nextDouble();
            a = (a * 3.5) ;
            b *= 7.5;

            double media = (a + b) / 11;
            System.out.printf("MEDIA = %.5f%n", media);


    }
}
