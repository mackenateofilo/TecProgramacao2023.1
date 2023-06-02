public class Posi {
    private boolean ocupado;
    private Peça peça;

    public Posi(){
        this.ocupado = false;
        this.peça = new Vazia();
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Peça getPeça() {
        return peça;
    }

    public void setPeça(Peça peça) {
        this.peça = peça;
        
        if (peça.getNome().equals("Vazia")){
            this.ocupado = false;
        }
        else{
            this.ocupado = true;
        }
    }  
}