
public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
        // O array de notas é inicializado assim:
        // [0.0, 0.0, 0.0, 0.0, 0.0]
    }

    // Métodos
    public void insereNotas() {}

    public double calculaMedia() {
        double media = 0.0;
        for (double n: this.notas) { media += n; }
        media = media/this.notas.length;
        return media;
    }

    // Calcula média ponderada
    public double calculaMedia(int[] pesos) {
        double media = 0.0;

        // Talvez eu implemente exceções depois
        if (pesos.length != 5) { System.exit(1); } // Sinal de erro 
        
        // Esse for-loop garante apenas que o array notas será
        // percorrido completamente, sendo multiplicado pelo
        // peso correspondente. Não garante nada sobre `pesos`
        for (int i = 0; i < this.notas.length; i++) {
            media += this.notas[i] * pesos[i];
        }

        return media;
    }

    // Getters
    public String getNome() { return this.nome; }

    public double[] getnotas() { return this.notas; }

    public double menorNota() {
        // Pegar um elemento do array garante não iniciar com valores errados
        double menor = this.notas[1]; 
        for (double n: this.notas) { if (n < menor) { menor = n; } }
        return menor;
    }

}

