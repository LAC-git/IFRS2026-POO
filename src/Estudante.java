
public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        notas = new double[5];
        // O array de notas é inicializado assim: [0.0, 0.0, 0.0, 0.0, 0.0]
    }
}

