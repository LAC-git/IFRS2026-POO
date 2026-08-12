package avaliacao.formula1;

public class Engenheiro extends Pessoa {

	private Piloto contratante;

	public Engenheiro(String nome, int idade, String nacionalidade, Piloto contratante) {
		super(nome, idade, nacionalidade);
		this.contratante = contratante;
	}

	public Piloto getContratante() {
		return this.contratante;
	}

	public void setContratante(Piloto contratante) {
		this.contratante = contratante;
	}
}
