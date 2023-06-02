public class Andador extends Robo {
    public Andador() {
        super(0, 0);
        this.setNome("Andador");
        this.setId("\u001B[32mA \u001B[0m");
    }

    public void avancar(int numCasasAvanco) {
        int posNovaHorizontal = this.getPosHorizontal() + 0;
        int posNovaVertical = this.getPosVertical() - numCasasAvanco;
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }

    public void retroceder(int numCasasRetro) {
        int posNovaHorizontal = this.getPosHorizontal() - 0;
        int posNovaVertical = this.getPosVertical() + numCasasRetro;
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }
}
