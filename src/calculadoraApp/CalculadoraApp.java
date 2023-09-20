package calculadoraApp;

import java.util.Scanner;

public class CalculadoraApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean continuar;

		do {
			double num1 = lerNumero("Digite o primeiro valor: ");
			String operacao = lerOperacao("Digite a operação (+, -, /, *): ");
			double num2 = lerNumero("Digite o segundo valor: ");

			if (operacaoValida(operacao)) {
				double resultado = realizarCalculo(num1, num2, operacao);
				System.out.println("Resultado: " + resultado);
			} else {
				System.out.println("Operação Inválida");
			}

			continuar = verificarNovaOperacao();
		} while (continuar);
		
		System.out.println("Obrigado por usar a calculadora!");

	}

	private static double lerNumero(String mensagem) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(mensagem);
		return scanner.nextDouble();
	}

	private static String lerOperacao(String mensagem) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(mensagem);
		return scanner.next();
	}

	private static boolean operacaoValida(String operacao) {
		return "+".equals(operacao) || "-".equals(operacao) || "*".equals(operacao) || "/".equals(operacao);
	}

	private static double realizarCalculo(double num1, double num2, String operacao) {
		switch (operacao) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case "/":
			if (num2 != 0) {
				return num1 / num2;
			} else {
				System.out.println("Divisão por zero não é permitida");
				return Double.NaN;
			}
		default:
			return Double.NaN;
		}
	}

	private static boolean verificarNovaOperacao() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Deseja continuar uma nova operação? (S ou N): ");
		return "S".equalsIgnoreCase(scanner.next());
	}

}
