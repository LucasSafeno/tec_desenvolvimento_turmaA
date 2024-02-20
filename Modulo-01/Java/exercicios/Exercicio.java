import java.util.Scanner;

public class Exercicio{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	
	double a,b;
	String op;

	System.out.println("Informe o PRIMEIRO numero : ");
	a = s.nextDouble();

	System.out.println("Informe o SEGUNDO numero : ");
	b = s.nextDouble();

	System.out.println("Informe a operacao desejada : +(SOMA) -(SUBSTRACAO) *(MULTIPLICAO) /(DIVISAO)");
	op = s.next();

	switch(op){
		case "+":
			double soma = a  + b;
			System.out.println(soma);
			break;
		case "-":
			double subtracao = a - b;
			System.out.println(subtracao);
			break;
		case "*":
			double multiplicacao = a * b;
			System.out.println(multiplicacao);
			break;
		case "/":
			double divisao = a / b;
			System.out.println(divisao);
			break;
		default:
			System.out.println("Operacao invalida");
		}

	}
}
