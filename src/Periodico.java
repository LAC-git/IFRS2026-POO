
public class Periodico extends Texto {
    private int numeroDoVolume;

    public Periodico(String titulo, int numeroDoVolume) {
        super(titulo);

        if (numeroDoVolume < 0) {
            // Não pode ser menor que zero, mas também vou usar essa excecção aí pq ela é unchecked e n quero ter q lidar com ela
            throw new IllegalArgumentException();
        }

        this.numeroDoVolume = numeroDoVolume;
    }

    public int getNumeroDoVolume() {
        return numeroDoVolume;
    }
}
