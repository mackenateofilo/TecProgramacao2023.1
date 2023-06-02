public class Peao extends Robo {
    public Peao(){
        super(1, 1);
        this.setNome("Peao");
        this.setId("\u001B[32mP \u001B[0m");
    } 
    
    public void avancar(int numCasasAvanco) {
        int posNovaHorizontal = this.getPosHorizontal() + numCasasAvanco;
        int posNovaVertical = this.getPosVertical() + 0;
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