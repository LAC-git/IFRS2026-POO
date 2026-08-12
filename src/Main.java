import avaliacao.lampada.Lampada;

public class Main {
    public static void main(String[] args) {

        Lampada minhaLampada = new Lampada();

        minhaLampada.exibirEstado();
        minhaLampada.interruptor();
        minhaLampada.exibirEstado();

        Lampada minhaLampada2 = new Lampada(false, 450);

        minhaLampada2.exibirEstado();
        minhaLampada2.interruptor();
        minhaLampada2.exibirEstado();
    }
}