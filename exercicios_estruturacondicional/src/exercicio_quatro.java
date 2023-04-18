import java.util.Scanner;

public class exercicio_quatro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, hora;

		System.out.printf("== Máx: 24hrs / Min: 1hr == %n%n");
		System.out.printf("Horário de início: ");
		num1 = sc.nextInt();
		System.out.printf("Horário de termino: ");
		num2 = sc.nextInt();

		if (num2 > num1) {
			hora = num2 - num1;
			System.out.printf("Duração Total: %d Horas", hora);
		} else if (num1 > num2) {
			hora = (24 - num1) + num2;
			System.out.printf("Duração Total: %d Horas", hora);
		} else {
			System.out.println("Duração Total: 24 Horas");
		}

		sc.close();

	}

}
