import java.util.ArrayList;

public class Jogador {
    public String nome;
    public ArrayList<Robo> robosDoJogador;

    public Jogador(String nome){
        this.nome = nome;
        this.robosDoJogador = new ArrayList<Robo>();

        Andador andador = new Andador();
        Peao peao = new Peao();
        Torre torre = new Torre();
        Bispo bispo = new Bispo();
        Cavalo cavalo = new Cavalo();
        Rei rei = new Rei();
        Rainha rainha = new Rainha();

        robosDoJogador.add(andador);
        robosDoJogador.add(peao);
        robosDoJogador.add(torre);
        robosDoJogador.add(bispo);
        robosDoJogador.add(cavalo);
        robosDoJogador.add(rei);
        robosDoJogador.add(rainha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Robo> getRobosDoJogador() {
        return robosDoJogador;
    }

    public void setRobosDoJogador(ArrayList<Robo> robosDoJogador) {
        this.robosDoJogador = robosDoJogador;
    }
}
