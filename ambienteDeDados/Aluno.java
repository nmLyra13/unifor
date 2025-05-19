package ambienteDeDados;

public class Aluno {

	private String matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	private String status;
	private double frequencia;

	// Construtor padrão - didática do prof.nelio.
	public Aluno() {
	}

	// Construtor com argumento
	public Aluno(String matricula, String nome, double nota1, double nota2, double nota3, double frequencia) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.frequencia = frequencia;
		calcularMedia();
		atualizarStatus();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
		calcularMedia();
		atualizarStatus();
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
		calcularMedia();
		atualizarStatus();
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
		calcularMedia();
		atualizarStatus();
	}

	public double getMedia() {
		return media;
	}

	public String getStatus() {
		return status;
	}

	public double getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
		atualizarStatus();
	}

	private void calcularMedia() {
		this.media = (nota1 + nota2 + nota3) / 3.0;
	}

	private void atualizarStatus() {
		if (media >= 6.0 && frequencia >= 75.0) {
			status = "Aprovado";
		} else {
			status = "Reprovado";
		}
	}

	public void exibirInformacoes() {
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("Notas: " + String.format("%.2f", nota1) + ", " + String.format("%.2f", nota2) + ", "
				+ String.format("%.2f", nota3));
		System.out.println("Média: " + String.format("%.2f", media));
		System.out.println("Frequência: " + frequencia + "%");
		System.out.println("Status: " + status);
	}

	@Override
	public String toString() {
		return String.format(
				"Matrícula: %s | Nome: %s " + "| Nota1: %.2f | Nota2: %.2f | Nota3: %.2f "
						+ "| Média: %.2f | Frequência: %.2f%% | Status: %s",
				matricula, nome, nota1, nota2, nota3, media, frequencia, status);
	}
}