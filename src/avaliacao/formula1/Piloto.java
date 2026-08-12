package avaliacao.formula1;

public class Piloto extends Pessoa {

	private int vitorias;

	public Piloto(String nome, int idade, String nacionalidade, int vitorias) {
		super(nome, idade, nacionalidade);
		this.vitorias = vitorias;
	}

	public int getVitorias() { return this.vitorias; }
	public void setVitorias(int vitorias) { this.vitorias = vitorias; }
}
