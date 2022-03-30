import java.util.List;
import java.util.Scanner;

import javax.xml.stream.events.EndDocument;
public class Main {
	public static void main(String[] args) {
		
		calc calc = new calc();
		
		Scanner leitor = new Scanner(System.in);
		
		double valor1,valor2;
		System.out.println("Digite o primeiro valor: ");
		valor1 = leitor.nextDouble();
		System.out.println("Digite o segundo valor: ");
		valor2 = leitor.nextDouble();
		System.out.println("$$ Calculadora $$");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Sair");
		int opcao;
		opcao = leitor.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Soma:" + calc.sum(valor1,valor2));
			calc.sum(valor1,valor2);
			break;
		case 2:
			System.out.println("Sub:" + calc.sub(valor1,valor2));
			calc.sub(valor1,valor2);
			break;
		case 3:
			System.out.println("Div:" + calc.div(valor1,valor2));
			calc.div(valor1,valor2);
			break;
		case 4:
			System.out.println("Mult:" + calc.mult(valor1,valor2));
			calc.mult(valor1,valor2);
			break;
		case 5:
			System.out.println("Tchau tchau!!");
			break;
		default:
			System.out.println("Opção Inválida");
		}
	}
}
