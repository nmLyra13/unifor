package ambienteDeDados;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=== Cadastro de Novo Aluno ===");

		System.out.print("Matrícula: ");
		String matricula = sc.nextLine();

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Nota 1: ");
		double nota1 = sc.nextDouble();

		System.out.print("Nota 2: ");
		double nota2 = sc.nextDouble();

		System.out.print("Nota 3: ");
		double nota3 = sc.nextDouble();

		System.out.print("Frequência (%): ");
		double frequencia = sc.nextDouble();

		// Criando o objeto Aluno
		Aluno novoAluno = new Aluno(matricula, nome, nota1, nota2, nota3, frequencia);

		// Exibindo as informações formatadas
		System.out.println("\n=== Dados do Aluno Cadastrado ===");
		novoAluno.exibirInformacoes();
		sc.close();
	}
}
