package calculadoraApp;

import java.util.Scanner;

public class CalculadoraApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double num1;
		Double num2;
		String operacao;
		boolean continuar;
		
		do {
			System.out.println("\nDigite o primeiro valor:");
			num1 = scanner.nextDouble();
			
			System.out.println("\nDigite a operação ( +, -, /, *): ");
			operacao = scanner.next();
			
			System.out.println("\nDigite o segundo valor:");
			num2 = scanner.nextDouble();
			
			System.out.println("Resultado: " + realizarCalculo(num1, num2, operacao));
			
			continuar = verificarNovaOperacao();
			
		}while ( continuar);
		
	}
	
	public static boolean verificarNovaOperacao() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Deseja continuar uma nova operação? ( S ou N): ");
		return scan.nextLine().toUpperCase().equals("S");
	}

	public static Double realizarCalculo(Double num1, Double num2, String operacao) {
		Double respostaCalculo = 0.0;

		switch (operacao) {
		case "+":
			respostaCalculo = num1 + num2;
			break;
		case "-":
			respostaCalculo = num1 - num2;
			break;
		case "/":
			respostaCalculo = num1 / num2;
			break;
		case "*":
			respostaCalculo = num1 * num2;
			break;

		default:
			System.out.println("Operação inválida");
		}
		return respostaCalculo;
	}

}
