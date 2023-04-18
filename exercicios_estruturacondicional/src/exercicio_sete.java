import java.util.Locale;
import java.util.Scanner;

public class exercicio_sete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double x, y;
		System.out.printf("Digite o valor de X: ");
		x = sc.nextDouble();
		System.out.printf("Digite o valor de y:");
		y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("O Ponto está no 1° QUADRANTE");
		} 
		else if (x < 0 && y > 0) {
			System.out.println("O Ponto está no 2° QUADRANTE");
		}
		else if (x < 0 && y < 0) {
			System.out.println("O Ponto está no 3° QUADRANTE");
		}
		else if (x > 0 && y < 0) {
			System.out.println("O Ponto está no 4° QUADRANTE");
		}
		else if (x == 0 && y != 0) {
			System.out.println("Está no sobre EIXO Y");
		}
		else if (x != 0 && y == 0) {
			System.out.println("Está no sobre EIXO X");
		}
		else {
			System.out.println("Está na ORIGEM");
		}

		sc.close();

	}

}
