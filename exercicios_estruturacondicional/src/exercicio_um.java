import java.util.Scanner;

public class exercicio_um {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Digite um número inteiro:");
		num = sc.nextInt();

		if (num >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		sc.close();

	}

}
