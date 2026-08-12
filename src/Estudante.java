
public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        notas = new double[5];
        // O array de notas é inicializado assim: [0.0, 0.0, 0.0, 0.0, 0.0]
    }

    public insereNotas() {}

    public double calculaMedia() {
        double media = 0.0;
        for (double n: this.notas) { media += n; }
        return media;
    }

    // Getters
    public String getNome() {}
    public double[] getnotas() {}
    public double menorNota() {}

}

