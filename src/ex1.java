import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeros [] = new int [10];
		
		System.out.println("Digite 10 n�meros");
		
		for(int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = teclado.nextInt();
		}
		
		for(int i = 0 ; i < numeros.length ; i++) {
			System.out.println("O n�mero " + (i + 1) + " �: " + numeros[i]);
		}
	}
}
