package lista3;

public class exerc12 {

	public static void main(String[] args) {
		
		int num = 10;
	    int numDivisores = 0;
		boolean numeroPrimo;
			
		for(int i = 1; i <= num; i++){
			if (num % i == 0){
			numDivisores++;
			}
			}
			if(numDivisores == 2){
			numeroPrimo = true;
			}
			else{
			numeroPrimo = false;
			}
			
		System.out.println(numeroPrimo);
	}

}
