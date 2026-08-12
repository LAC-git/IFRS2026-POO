package avaliacao.formula1;

import java.util.ArrayList;

public class Teste {
	public Teste() {

		// Criando um CarroF1
		ArrayList<Patrocinador> listaPatrocinadores = new ArrayList<Patrocinador>();
		listaPatrocinadores.add(new Patrocinador("nomePatrocinador1", 1000));
        listaPatrocinadores.add(new Patrocinador("nomePatrocinador2", 2000));
		listaPatrocinadores.add(new Patrocinador("nomePatrocinador3", 3000));
    	Time time = new Time("nomeTimeTeste", 1970, listaPatrocinadores);
		Piloto piloto = new Piloto("nomePilotoTeste", 23, "brasileiro", 41);
		CarroF1 carro = new CarroF1(3, 2, time, piloto);
		// Fim da criação do CarroF1
        

		// Exibindo os valores
        System.out.printf("* Número: %d\n", carro.getNumero());
		System.out.printf("* Posição: %d\n\n", carro.getPosicao());

		System.out.printf("* Time:\n");
		System.out.printf("\t- Nome: %s\n", carro.getTime().getNome());
		System.out.printf("\t- Ano de fundação: %d\n", carro.getTime().getAnoDeFundacao());

		System.out.printf("\t- Patrocinadores:\n");
		for (Patrocinador elemento : carro.getTime().getPatrocinadores()) {
			System.out.printf("\t\tNome: %s\n", elemento.getNome());
			System.out.printf("\t\tValor: %d\n\n", elemento.getValor());
		}
        
		System.out.printf("* Piloto:\n");
		System.out.printf("\t- Nome: %s\n", carro.getPiloto().getNome());
		System.out.printf("\t- Idade: %d\n", carro.getPiloto().getIdade());
		System.out.printf("\t- Nacionalidade: %s\n", carro.getPiloto().getNacionalidade());

        // Criando um Engenheiro
        Engenheiro eng = new Engenheiro("Henry Ford", 38, "Estadunidense", piloto);

        // Mostrando engenherio
		System.out.printf("\n* Engenheiro:\n");
		System.out.printf("\t- Piloto Contratante: %s\n", eng.getContratante().getNome());
		System.out.printf("\t- Nome: %s\n", eng.getNome());
		System.out.printf("\t- Idade: %d\n", eng.getIdade());
		System.out.printf("\t- Nacionalidade: %s\n", eng.getNacionalidade());
        
        
	}
}
