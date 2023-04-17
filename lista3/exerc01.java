package lista3;
public class exerc01 {

	public static void main(String[] args) {
		
		
		int vetor[] = {1,2,1,10,5,6};
		int soma = funcaoSoma(vetor, 2);
		
		System.out.print("O resultado da soma é: " + soma);

	}

	public static int funcaoSoma(int[] vetor, int i) {
		
		if(i < (vetor.length-2)){
			return vetor[i] + funcaoSoma(vetor, i + 1);
		}
		
		else return 0;
	}
}
