package avaliacao.formula1;

public class CarroF1 {

	private int numero;
	private int posicao;
	private Time time;
	private Piloto piloto;

	public CarroF1(int numero, int posicao, Time time, Piloto piloto) {
		this.numero = numero;
		this.posicao = posicao;
		this.time = time;
		this.piloto = piloto;
	}

	public int getNumero() { return this.numero; }
	public void setNumero(int numero) { this.numero = numero; }

	public int getPosicao() { return this.posicao; }
	public void setPosicao(int posicao) { this.posicao = posicao; }

	public Time getTime() { return this.time; }
	public void setTime(Time time) { this.time = time; }

	public Piloto getPiloto() { return this.piloto; }
	public void setPiloto(Piloto piloto) { this.piloto = piloto; }
}
