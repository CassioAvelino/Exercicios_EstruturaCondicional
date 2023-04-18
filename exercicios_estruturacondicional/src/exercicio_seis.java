import java.util.Locale;
import java.util.Scanner;

public class exercicio_seis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double num;
		System.out.println("Intervalos: |[0,25] - [25,50] - [50,75] - [75,100]|");
		System.out.printf("Digite um número:");
		num = sc.nextDouble();

		if (num < 0 || num > 100) {
			System.out.println("Fora do Intervalo");
		} 
		else if (num <= 25.0) {
			System.out.println("Intervalo: [0,25]");
		} 
		else if (num <= 50.0) {
			System.out.println("Intervalo: [25,50]");
		} 
		else if (num <= 75) {
			System.out.println("Intervalo: [50,75]");
		} 
		else {
			System.out.println("Intervalo: [75,100]");
		}
		sc.close();

	}

}
