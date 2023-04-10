package lista2;

import java.util.Scanner;

public class exerc04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroUsuario =0;
		int indice=0;
	
	   System.out.println("Numero de entrada:");
	   numeroUsuario = entrada.nextInt();

	   while(indice <=10) {
		   System.out.println(numeroUsuario + "x" + indice + "=" + numeroUsuario*indice);
		   indice++;
	   }
	}

}
