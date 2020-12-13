import java.util.Scanner;

public class exemplo1 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
				
		//declaração do array
		double notas [] = new double[5];
		
		// armazenando notas em um array
		for( int i = 0 ; i < 5 ; i++) {
			System.out.println("digite 5 notas");
			notas[i] = teclado.nextDouble();
		}
		
		// usado para imprimir as notas do array
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("A nota " + (i+1) + " é ...." + notas[i]);
		}
		
		
		//usando o length
		
		for( int i = 0 ; i < notas.length ; i++) {
			System.out.println("digite 5 notas");
			notas[i] = teclado.nextDouble();
		}
		
		// usado para imprimir as notas do array
		for(int i = 0 ; i < notas.length ; i++) {
			System.out.println("A nota " + (i+1) + " é ...." + notas[i]);
		}
	}
}
