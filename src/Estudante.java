
public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
        // O array de notas é inicializado assim: [0.0, 0.0, 0.0, 0.0, 0.0]
    }

    // Métodos
    public void insereNotas() {}

    public double calculaMedia() {
        double media = 0.0;
        for (double n: this.notas) { media += n; }
        media = media/this.notas.length;
        return media;
    }

    public double calculaMedia(int[] pesos) {
        // Calcula média ponderada
        double media = 0.0;
        return media;
    }

    // Getters
    public String getNome() { return this.nome; }

    public double[] getnotas() { return this.notas; }

    public double menorNota() {

        // Pegar um elemnto do array garante não iniciar com valores errados
        double menor = this.notas[1]; 
        for (double n: this.notas) { if (n < menor) { menor = n; } }
        return menor;
    }

}

