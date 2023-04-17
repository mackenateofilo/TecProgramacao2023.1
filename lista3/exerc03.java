package lista3;

public class exerc03 {

		public static void main(String[] args) {
			float somaNotas = 0;
			float somaPesos = 0;
			float media;
			double[] notas = {2,5,7};
			double[] pesos= {2,4,5};
			
			for (int i = 0; i < notas.length; i++){
				double notaComPeso = notas[i] * pesos[i];
				somaNotas += notaComPeso;
				}
			
			for (double i : pesos){
				somaPesos += i;
				}
			
			media = somaNotas / somaPesos;
		
	         
			  System.out.println("a média dos vetores é: " + media);
			  
		}

	}
