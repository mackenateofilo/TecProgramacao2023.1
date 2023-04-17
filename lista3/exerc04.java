package lista3;

public class exerc04 {

	public static void main(String[] args) {
		int[] vetor1 = {6,7};
		int[] vetor2 = {7,7};
		int elementoBuscado = 7;
		int quantidadeElemento = 0;
			
		for(Integer i : vetor1){
			if (i == elementoBuscado){
			quantidadeElemento++;
			}
			}
			for(Integer i : vetor2){
			if (i == elementoBuscado){
			quantidadeElemento++;
			}
	
     }
	System.out.println("a quantidade de vezes que o elemento aparece é: " + quantidadeElemento);		
}}