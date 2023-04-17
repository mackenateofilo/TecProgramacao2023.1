package lista3;

public class exerc08 {

	public static void main(String[] args) {

			int vetor[] = {1,6,8};
			int cont=0;
			int aux =0;
	        int maior = 0;
	        int i;
			
		for (i=0; i < vetor.length; i++) {	
	      if (vetor[i]<aux) {
	    	  vetor[i] = aux;
	    	  cont++;
	      }
		}
		
		System.out.println("o menor numero do vetor é: " + maior);
	    }
		

	}
