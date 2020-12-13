import java.util.Scanner;

public class ex2 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nomes [] = new String [5];
		
		System.out.println("Digite alguns nomes aí..");
		
		for(int i = 0 ; i < nomes.length ; i++) {
			nomes[i] = teclado.nextLine();
		}
		
		for(int i = nomes.length-1 ; i >= 0 ; i--) {
			System.out.println("O nome " + (i + 1) + " é: " + nomes[i]);
		}
		
	}
}
