
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

}
