import java.util.Scanner;

public class ex3 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int vetorA [] = new int [8];

		int vetorB [] = new int [8];
		
		System.out.println("Digite 8 números");
		
		for(int i = 0 ; i < vetorA.length ; i++ ) {
			vetorA[i] = teclado.nextInt();
			vetorB[i] = vetorA[i] * 3;
		}
		
		for(int i = 0 ; i < vetorB.length ; i++ ) {
			System.out.println("O número " + vetorA[i] +" x 3 é: "+ vetorB[i]);
		}
	}
}
