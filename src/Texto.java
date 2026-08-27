
abstract class Texto {
    private String titulo;

    public Texto(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    // Sem setTitulo() pq teoricamente não é possivel mudar o titulo uma vez que o livro já foi publicado
}
