package avaliacao.formula1;

import java.util.ArrayList;

public class Time {

	private String nome;
	private int anoDeFundacao;
	private ArrayList<Patrocinador> patrocinadores;

	public Time(String nome, int anoDeFundacao, ArrayList<Patrocinador> patrocinadores) {
		this.nome = nome;
		this.anoDeFundacao = anoDeFundacao;
		this.patrocinadores = patrocinadores;
	}

	public String getNome() { return this.nome; }
	public void setNome(String nome) { this.nome = nome; }

	public int getAnoDeFundacao() { return this.anoDeFundacao; }
	public void setAnoDeFundacao(int anoDeFundacao) { this.anoDeFundacao = anoDeFundacao; }

	public ArrayList<Patrocinador> getPatrocinadores() { return this.patrocinadores; }
	public void setPatrocinadores(ArrayList<Patrocinador> patrocinadores) { this.patrocinadores = patrocinadores; }
}
