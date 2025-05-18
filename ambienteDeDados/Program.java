
package ambienteDeDados;

public class Program {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("2023001", "CHIQUINHA", 7.5, 8.0, 6.5, 80);
		Aluno aluno2 = new Aluno("2023002", "CHAVES", 7.0, 7.5, 6.0, 85);
		Aluno aluno3 = new Aluno("2023003", "SEU MADRUGA", 4.0, 3.5, 7.5, 80);
		Aluno aluno4 = new Aluno("2023004", "KIKO", 1.0, 1.5, 0, 40);
		Aluno aluno5 = new Aluno("2023005", "GIRAFALES", 9.0, 9.5, 10, 100);

		System.out.println("=== Informações Iniciais ===");
		aluno1.exibirInformacoes();
		System.out.println("-------------------------");
		aluno2.exibirInformacoes();
		System.out.println("-------------------------");
		aluno3.exibirInformacoes();
		System.out.println("-------------------------");
		aluno4.exibirInformacoes();
		System.out.println("-------------------------");
		aluno5.exibirInformacoes();
		System.out.println("-------------------------");

		System.out.println("\n=== Relatório Final de Alunos ===");
		Aluno[] alunos = { aluno1, aluno2, aluno3, aluno4, aluno5 };

		for (Aluno aluno : alunos) {
			System.out.println(aluno.getMatricula() + " - " + aluno.getNome() + " | Média: "
					+ String.format("%.2f", aluno.getMedia()) + " | Frequência: "
					+ String.format("%.2f", aluno.getFrequencia()) + "% | Status: " + aluno.getStatus());
		}
	}
	
}
