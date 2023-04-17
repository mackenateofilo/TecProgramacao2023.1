package lista3;
public class exerc02 {

		public static void main(String[] args) {
			int vet1 [] = {2,4};
			int vet2 [] = {2,4};
			int soma = 0;
			float media =0;
		    
		for(int i = 0; i < vet1.length; i++)
		     soma += vet1[i];

		for(int j = 0; j < vet2.length; j++)
              soma += vet2[j];

		      media = soma / (vet1.length + vet2.length);
	         
			  System.out.println("a média dos vetores é: " + media);
   }
		
}