public abstract class Peça {
    private String nome;
    private String id;
    private int posHorizontal;
    private int posVertical;
    private int pont;

    public Peça(String nome, String id, int pont) {
        this.nome = nome;
        this.id = id;
        this.posHorizontal = 0;
        this.posVertical = 0;
        this.pont = pont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPosHorizontal() {
        return posHorizontal;
    }

    public void setPosHorizontal(int posHorizontal) {
        this.posHorizontal = posHorizontal;
    }

    public int getPosVertical() {
        return posVertical;
    }

    public void setPosVertical(int posVertical) {
        this.posVertical = posVertical;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }
}
