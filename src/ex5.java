import java.util.Scanner;

public class ex5 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int vetorA [] = new int [4];

		int vetorB [] = new int [7];
		
		int vetorC [] = new int [vetorA.length + vetorB.length];

		
		System.out.println("Digite 4 números");
		for(int i = 0 ; i < vetorA.length ; i++) {
			vetorA[i] = teclado.nextInt();
		}
		
		System.out.println("Digite 7 números");
		for(int i = 0 ; i < vetorB.length ; i++) {
			vetorB[i] = teclado.nextInt();
		}
		
		for(int i = 0 ; i < vetorC.length ; i++) {
			if(i < vetorA.length) {
				vetorC[i] = vetorA[i];
			}else {
				vetorC[i] = vetorB[i - vetorA.length];
			}
		}
	
		for(int i = 0 ; i < vetorC.length ; i++) {
			System.out.println(vetorC[i]);
		}
		
		

	}
}
