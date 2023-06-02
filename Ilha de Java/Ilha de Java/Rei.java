public class Rei extends Robo {
    public Rei(){
        super(4, 4);
        this.setNome("Rei");
        this.setId("\u001B[32mR \u001B[0m");
    } 

    public void avancar(int numCasasAvanco) {
        int posNovaHorizontal = this.getPosHorizontal() + numCasasAvanco;
        int posNovaVertical = this.getPosVertical() - 0;
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }

    public void retroceder(int numCasasRetro) {
        int posNovaHorizontal = this.getPosHorizontal() - numCasasRetro;
        int posNovaVertical = this.getPosVertical() - 0;
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }
}