import java.util.Locale;
import java.util.Scanner;

public class exercicio_cinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int cod, quant;
		double total;

		System.out.println("=============================");
		System.out.println("LANCHONETE QUE DELICIA");
		System.out.println("=============================");
		System.out.println("CÓD | Especificação | Preço");
		System.out.println(" 1  | 	Hot Dog		| R$4.00");
		System.out.println(" 2  | 	X-Salada	| R$4.50");
		System.out.println(" 3  | 	X-Bacon		| R$5.00");
		System.out.println(" 4  | 	Torrada		| R$2.00");
		System.out.println(" 5  |  Refrigerante	| R$1.50");
		System.out.println("=============================");
		System.out.printf("Digite o código que você deseja: ");
		cod = sc.nextInt();
		System.out.println("==============================");
		System.out.printf("Quantos você deseja: ");
		quant = sc.nextInt();
		System.out.println("==============================");

		if (cod == 1) {
			total = quant * 4.0;
		} 
		else if (cod == 2) {
			total = 4.5 * quant;
		} 
		else if (cod == 3) {
			total = 5.0 * quant;
		} 
		else if (cod == 2) {
			total = 2.0 * quant;
		} 
		else {
			total = 1.5 * quant;
		}

		System.out.printf("Total a Pagar: %.2f", total);

		sc.close();

	}

}
