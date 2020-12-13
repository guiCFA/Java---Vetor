import java.util.Scanner;

public class ex4 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int vetorA [] = new int [3];

		int vetorB [] = new int [3];
		
		int vetorC [] = new int [3];

	
		System.out.println("Digite 2 números");
		
		for(int i = 0 ; i < vetorA.length ; i++ ) {		
			vetorA[i] = teclado.nextInt();
			vetorB[i] = teclado.nextInt();
			
			System.out.println("Digite mais 2 números");
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		
		for(int i = 0 ; i < vetorB.length ; i++ ) {
			System.out.println("O número " + vetorA[i] +" - "+ vetorB[i] + " é: " + vetorC[i]);
		}
		
	
		
		
		
		
	}
}
