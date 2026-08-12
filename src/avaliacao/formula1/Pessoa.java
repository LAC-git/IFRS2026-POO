package avaliacao.formula1;

public class Pessoa {
	private String nome;
	private int idade;
	private String nacionalidade;

	public Pessoa(String nome, int idade, String nacionalidade) {
		this.nome = nome;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() { return this.nome; }
	public void setNome(String nome) { this.nome = nome; }

	public int getIdade() { return this.idade; }
	public void setIdade(int idade) { this.idade = idade; }
	
	public String getNacionalidade() { return this.nacionalidade; }
	public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

}
