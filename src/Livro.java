
public class Livro extends Texto {
    private Situacao situacao;

    public enum Situacao {
        DISPONIVEL,
        EMPRESTADO
    }

    public Livro(String titulo, Situacao situacao) {
        super(titulo);
        this.situacao = Situacao.DISPONIVEL;
    }

    public String getSituacao() {
        // Bora usar esse toString grátis do Enums
        return situacao.toString();
    }
}
