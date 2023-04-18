import java.util.Scanner;

public class exercicio_tres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.printf("Digite um número inteiro: ");
		num1 = sc.nextInt();
		System.out.printf("Digite um número inteiro: ");
		num2 = sc.nextInt();

		if ((num1 % num2 == 0) || (num2 % num1 == 0)) {
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não São Múltiplos");
		}
		sc.close();

	}

}
