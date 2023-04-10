package lista2;
import java.util.Scanner; 

public class exerc02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int numeroUsuario=0;
		int soma=0;
		
		System.out.println("Numeros de entrada:");
       
	    do {
	    	numeroUsuario = entrada.nextInt();
	    	if (numeroUsuario >= 0)
	    	soma = soma + numeroUsuario;
	    	
			} while (numeroUsuario >= 0);
	   
	    System.out.println("A soma dos números é:" + soma);
	}
} 