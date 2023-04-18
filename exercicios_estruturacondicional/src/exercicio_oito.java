import java.util.Locale;
import java.util.Scanner;

public class exercicio_oito {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double imposto, renda;

		System.out.println("=============================================");
		System.out.println("	Quadro do Imposto		");
		System.out.println("=============================================");
		System.out.println("	Renda 		| Imposto de Renda");
		System.out.println("=============================================");
		System.out.println(" de 0.00 até 2000.00 	| Isento");
		System.out.println(" de 2000.01 até 3000.00 | 8%");
		System.out.println(" de 3000.01 até 4500.00 | 18%");
		System.out.println(" Acima de 4500.00 	| 28%");
		System.out.println("=============================================");
		System.out.printf("Digite sua Renda: ");
		renda = sc.nextDouble();

		if (renda <= 2000) {
			System.out.println("ISENTO");
		} 
		else if(renda > 2000.01 && renda <= 3000){
			imposto = (renda - 2000)*0.08;
			System.out.printf("Valor do imposto: %.2f", imposto);
		}
		else if(renda > 3000.01 && renda <= 4500){
			imposto = (renda - 3000)*0.18 + 1000*0.08;
			System.out.printf("Valor do imposto: %.2f", imposto);
		}
		else {
			imposto = (renda - 4500)*0.28 + 1500*0.18 + 1000*0.08;
			System.out.printf("Valor do imposto: %.2f", imposto);
		}
		
		sc.close();

	}

}
