import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    public Plano planoJogo;
    public ArrayList<Peça> peças;
    public int numAlunosJogo;
    public Jogador jogador;
    public int rodada;
    public Scanner scan = new Scanner(System.in);
    public Random gerador = new Random();

    public Jogo(){
        this.rodada = 1;
       
        System.out.println("======================= ILHA DE JAVA =======================");
        this.jogador = this.criarJogador();  

        System.out.println("Bem vindo, a iIlha de Java. Sr(a). " + this.jogador.getNome());

        this.planoJogo = this.criarPlano();

        this.jogador.getRobosDoJogador().get(0).setNumCasasAvancoMAX(this.planoJogo.getAltura());
        this.jogador.getRobosDoJogador().get(0).setNumCasasRetroMAX(this.planoJogo.getAltura());

        this.peças = new ArrayList<Peça>();
        this.criarListaPeças();

        this.colocarRobos();
        this.sortearPeças();
    }

    public Jogador criarJogador(){
        System.out.println("Informe Seu Nome: ");
        
        Jogador jogador = new Jogador(scan.next());

        return jogador;
    }

    public Plano criarPlano(){
        System.out.println("================== DIMENSÕES DO PLANO ==================");
        System.out.println("Qual a Largura do Plano? ");
        int largura = scan.nextInt();
        System.out.println("Qual a Altura do Plano? ");
        int altura = scan.nextInt();

        Plano plano = new Plano(largura, altura);

        return plano;
    }

    public void criarListaPeças(){
        int numAlunos;
        int numBugs;

        System.out.println("Quantos Alunos Você Deseja que o Jogo Tenha? ");
        numAlunos = scan.nextInt();
        System.out.println("Quantos Bugs Você Deseja que o Jogo Tenha? ");
        numBugs = scan.nextInt();

        while ((numAlunos + numBugs) > (this.planoJogo.getAltura() * this.planoJogo.getLargura()) / 2){
            System.out.println("===================================== AVISO ===================================================");
            System.out.println("=  Quantidade de Alunos e Bugs é Superior que As Permitidas Pelo Jogo! Insira Novos Valores!  =");
            System.out.println("===============================================================================================");
            
            System.out.println("Quantos Alunos Você Deseja que o Jogo Tenha? ");
            numAlunos = scan.nextInt();
            System.out.println("Quantos Bugs Você Deseja que o Jogo Tenha? ");
            numBugs = scan.nextInt();
        }

        this.numAlunosJogo = numAlunos;

        for (int i = 0; i < numAlunos; i++){
            Aluno aluno = new Aluno();
            this.peças.add(aluno);
        }

        for (int i = 0; i < numBugs; i++){
            Bug bug = new Bug();
            this.peças.add(bug);
        }
    }

    public void mostrarPlano(){
        for (int i = 0; i < this.planoJogo.getAltura(); i++){
            for (int j = 0; j < this.planoJogo.getLargura(); j++){
                System.out.print(this.planoJogo.plano[i][j].getPeça().getId());
            }
            System.out.print("\n");
        }
    }

    public void sortearPeças(){
        for (Peça p : this.peças){
            int posHorizontal = gerador.nextInt(this.planoJogo.getLargura());
            int posVertical = gerador.nextInt(this.planoJogo.getAltura());

            while (this.planoJogo.plano[posVertical][posHorizontal].isOcupado() == true){
                posHorizontal = gerador.nextInt(this.planoJogo.getLargura());
                posVertical = gerador.nextInt(this.planoJogo.getAltura());
            }

            this.planoJogo.plano[posVertical][posHorizontal].setPeça(p);
        }
    }

    public void colocarRobos(){
        for (Robo robo : this.jogador.getRobosDoJogador()){
            this.planoJogo.plano[this.planoJogo.getAltura()-1][0].setPeça(robo);
            robo.setPosVertical(this.planoJogo.getAltura()-1);
            robo.setPosHorizontal(0);
        }
    }

    public void avancarRobo(Robo robo){
        Vazia vazia = new Vazia();
        this.planoJogo.plano[robo.getPosVertical()][robo.getPosHorizontal()].setPeça(vazia);

        System.out.println("Você quer Avançar a Peça " + robo.getNome() + " Quantas Casas?");
        int numCasasAvanco = scan.nextInt();

        while (numCasasAvanco > robo.getNumCasasAvancoMAX()){
            System.out.println("O Valor de Casas a ser Avançado é Maior que O Valor Máximo de Casas(" + robo.getNumCasasAvancoMAX() + ") que " + robo.getNome() + " Consegue Avançar, por favor insira um novo valor: " );
            numCasasAvanco = scan.nextInt();
        }

        robo.avancar(numCasasAvanco);
        this.resultadoMov(robo);
        this.planoJogo.plano[robo.getPosVertical()][robo.getPosHorizontal()].setPeça(robo);
    }

    public void retrocederRobo(Robo robo){
        Vazia vazia = new Vazia();
        this.planoJogo.plano[robo.getPosVertical()][robo.getPosHorizontal()].setPeça(vazia);

        System.out.println("Você quer Retroceder a Peça " + robo.getNome() + " Quantas Casas?");
        int numCasasRetro = scan.nextInt();

        while (numCasasRetro > robo.getNumCasasRetroMAX()){
            System.out.println("O Valor de Casas a ser Retrocedido é Maior que O Valor Máximo de Casas (" + robo.getNumCasasRetroMAX() + ") que " + robo.getNome() + " Consegue Retroceder, por favor insira um novo valor: " );
            numCasasRetro = scan.nextInt();
        }

        robo.retroceder(numCasasRetro);
        this.resultadoMov(robo);
        this.planoJogo.plano[robo.getPosVertical()][robo.getPosHorizontal()].setPeça(robo);
    }

    public void resultadoMov(Robo robo){
        if (this.planoJogo.plano[robo.getPosVertical()][robo.getPosHorizontal()].isOcupado() == true){
            System.out.println("\u001B[34m======================= RESULTADO =======================\u001B[0m");
            System.out.println("\u001B[34m" + robo.getNome() + " Encontrou um " + this.planoJogo.plano[robo.getPosVertical()][robo.getPosHorizontal()].getPeça().getNome() + "\u001B[0m");
            System.out.println("\u001B[34m" + this.planoJogo.plano[robo.getPosVertical()][robo.getPosHorizontal()].getPeça().getPont() + " PONTOS\u001B[0m");
            System.out.println("\u001B[34m=========================================================\u001B[0m");
            
            robo.setPont(robo.getPont() + this.planoJogo.plano[robo.getPosVertical()][robo.getPosHorizontal()].getPeça().getPont());

            this.numAlunosJogo--;
        }
        else{
            System.out.println("\u001B[31m======================= RESULTADO =======================\u001B[0m");
            System.out.println("\u001B[31m" + robo.getNome() + " Andou e....\u001B[0m");
            System.out.println("\u001B[31mA POSIÇÃO ESTAVA DESOCUPADO!\u001B[0m");
            System.out.println("\u001B[31m=========================================================\u001B[0m");
        }
    }

    public void jogar(){
        boolean jogando = true;

        while(jogando == true){
            System.out.println("========================= RODADA " + this.rodada + " =========================");
            this.mostrarPlano();
    
            for (Robo robo : this.jogador.getRobosDoJogador()){
                System.out.println("\u001B[33mQue Ação Você Deseja Realizar com " + robo.getNome() + "\u001B[0m");
                System.out.println("\u001B[33m(1) - Avançar \n(2) - Retroceder\u001B[0m");
                System.out.println("\u001B[33mCaso queira fechar o jogo insira 0, até que o jogo seja Fechado!\u001B[0m");
    
                int acao = scan.nextInt();
    
                if (acao == 1){
                    this.avancarRobo(robo);
                }
                else if (acao == 2){
                    this.retrocederRobo(robo);
                }
                else if (acao == 0 || this.numAlunosJogo == 0){
                    jogando = false;
                }
        
                this.mostrarPlano();
            }

            this.rodada++;
        }

        this.relatorioFinal();
    }

    public void relatorioFinal(){
        System.out.println("========================= FIM DE JOGO =========================");
        System.out.println(this.jogador.getNome() + " Você Jogou " + this.rodada + " Rodadas!");
        System.out.println("Relatorio dos robos: ");

        for (Robo robo : this.jogador.getRobosDoJogador()) {
            System.out.println(robo.getNome() + " = " + robo.getPont() + " Pontos");
        }
    }
}
