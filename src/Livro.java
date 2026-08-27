
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

    // Representam as operações de emprestar e devolver,
    // num projeto de verdade provavelmente teria que ter mais código pra guardar quem emprestou etc

    public boolean emprestar() {
        if (situacao == Situacao.DISPONIVEL) {
            this.situacao = Situacao.EMPRESTADO;
            return true; // True = deu certo
        }

        // daria pra usar um 'throw' e exceções mas to sem tempo
        return false; // False = já foi emprestado antes
    }

    public boolean devolver() {
        if (situacao == Situacao.EMPRESTADO) {
            this.situacao = Situacao.DISPONIVEL;
            return true;
        }
        return false;
    }
}
