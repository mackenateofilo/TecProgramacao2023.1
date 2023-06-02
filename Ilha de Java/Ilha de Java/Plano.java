public class Plano {
    private int largura;
    private int altura;
    public Posi[][] plano;

    public Plano(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
        this.plano = new Posi[altura][largura];
      
        for (int i = 0; i < altura; i++){
            for (int j = 0; j < largura; j++){
                plano[i][j] = new Posi();
            }
        }
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Posi getPlano(int i, int j) {
        return this.plano[i][j];
    }
    
    public void setPlano(Posi[][] plano) {
        this.plano = plano;
    }
}