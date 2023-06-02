public class Bispo extends Robo {
    public Bispo(){
        super(2, 2);
        this.setNome("Bispo");
        this.setId("\u001B[32mB \u001B[0m");
    } 
     
    public void avancar(int numCasasAvanco) {
        int posNovaHorizontal = this.getPosHorizontal() + numCasasAvanco;
        int posNovaVertical = this.getPosVertical() - numCasasAvanco;
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }

    public void retroceder(int numCasasRetro) {
        int posNovaHorizontal = this.getPosHorizontal() - numCasasRetro;
        int posNovaVertical = this.getPosVertical() +  numCasasRetro;
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }
}