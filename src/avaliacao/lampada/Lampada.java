package avaliacao.lampada;

public class Lampada {
    // VARIÁVEIS: Guardam as características da lâmpada (estado, potência e o valor padrão de 60W).
    private boolean isOn;
    private int watts;
    final int DEFAULT_WATTS = 60;

    // CONSTRUTOR 1: Cria a lâmpada com valores fixos definidos por você (desligada e 60W).
    public Lampada() {
       this.isOn = false;
       this.watts = DEFAULT_WATTS;
    }

    // CONSTRUTOR 2: Diferente do primeiro, este exige que você informe o estado e os watts na hora de criar a lâmpada.
    public Lampada(boolean isOn, int watts) {
        this.isOn = isOn;
        this.watts = watts;
    }

    // METODO: Ação que inverte o estado da lâmpada (se ligada, desliga; se desligada, liga).
    public void interruptor() {
        if (this.isOn) {
            this.isOn = false;
            System.out.printf("A lâmpada esta desligada.%n");
        } else {
            this.isOn = true;
            System.out.printf("A lâmpada esta ligada.%n");
        }
    }

    // METODO: Ação que apenas imprime na tela se a lâmpada está ligada/desligada e sua potência.
    public void exibirEstado() {
        if (this.isOn) {
            System.out.printf("A lâmpada esta ligada.%n");
            System.out.printf("Watts: %d%n", this.watts);
        } else {
            System.out.printf("A lâmpada esta desligada.%n");
            System.out.printf("Watts: %d%n", this.watts);
        }
    }

    // GETTERS E SETTERS: Métodos para ler (get) ou alterar (set) as variáveis com segurança.
    public boolean getIsOn() { return this.isOn; }
    public void setON(boolean isOn) { this.isOn = isOn; }
    public int getWatts() { return this.watts; }

    // O setWatts tem uma regra extra: se informar uma potência inválida, ele força o padrão (60W).
    public void setWatts(int watts) {
        if ( watts < 1 || watts > 1000 ) {
            this.watts = DEFAULT_WATTS;
            return;
        }
        this.watts = watts;
    }
}