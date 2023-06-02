public class Torre extends Robo{
    public Torre(){
        super(2, 2);
        this.setNome("Torre");
        this.setId("\u001B[32mT \u001B[0m");
    } 
    
    public void avancar(int numCasasAvanco) {
        int posNovaHorizontal = this.getPosHorizontal() - 0;
        int posNovaVertical = this.getPosVertical() - numCasasAvanco;
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }

    public void retroceder(int numCasasRetro) {
        int posNovaHorizontal = this.getPosHorizontal() + 0;
        int posNovaVertical = this.getPosVertical() +  numCasasRetro;
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }
}