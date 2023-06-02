public abstract class Robo extends Peça {
    private int numCasasAvancoMAX;
    private int numCasasRetroMAX;

    public Robo(int numCasasAvanco, int numCasasRetro) {
        super("Robo", "R ", 0);
        this.numCasasAvancoMAX = numCasasAvanco;
        this.numCasasRetroMAX = numCasasRetro;
    }
   
    public int getNumCasasAvancoMAX() {
        return numCasasAvancoMAX;
    }

    public void setNumCasasAvancoMAX(int numCasasAvancoMAX) {
        this.numCasasAvancoMAX = numCasasAvancoMAX;
    }

    public int getNumCasasRetroMAX() {
        return numCasasRetroMAX;
    }

    public void setNumCasasRetroMAX(int numCasasRetroMAX) {
        this.numCasasRetroMAX = numCasasRetroMAX;
    }

    public void avancar(int numCasasAvanco) {
        int posNovaHorizontal = this.getPosHorizontal() + numCasasAvanco;
        int posNovaVertical = this.getPosVertical() + numCasasAvanco;
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }

    public void retroceder(int numCasasRetro) {
        int posNovaHorizontal = this.getPosHorizontal() - numCasasRetro;
        int posNovaVertical = this.getPosVertical() - numCasasRetro;
        this.setPosHorizontal(posNovaHorizontal);
        this.setPosVertical(posNovaVertical);
    }
}