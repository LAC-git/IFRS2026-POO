
import Estudante;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    }

    public ArrayList<Estudante> estudantesAprovados(Estudante[] ests) {
        ArrayList<Estudante> aprovados = new ArrayList<>();

        for (Estudante e: ests) {
            if (e.calculaMedia() >= 6.0) { aprovados.add(e); }
        }

        if (aprovados.size() == 0) { return null; }
        return aprovados;
    }
}
