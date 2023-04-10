package lista2;
import java.util.Random;
import java.util.Scanner;

public class exerc03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
	
		int numeroPrograma = random.nextInt(100) + 1;
        int numeroUsuario =0;
		
        System.out.println("Numero de entrada:");
	    numeroUsuario = entrada.nextInt();
	    
		while (numeroUsuario != numeroPrograma) {
			if(numeroUsuario > numeroPrograma ) {
				System.out.println("O número sorteado é menor, digite novamente:");
				numeroUsuario = entrada.nextInt();
			}  else if (numeroUsuario < numeroPrograma ) {
				System.out.println("O número sorteado é maior, digite novamente:");
				numeroUsuario = entrada.nextInt();
			} else{
				
			}
		}
		System.out.println("Numero correto é: " + numeroPrograma);
	}
}