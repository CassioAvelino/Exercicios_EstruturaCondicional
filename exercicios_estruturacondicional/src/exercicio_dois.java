import java.util.Scanner;

public class exercicio_dois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.printf("Digite um número inteiro: ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Número PAR");
		} else {
			System.out.println("Número IMPAR");
		}
		sc.close();
	}

}
