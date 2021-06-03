package semana1;
import java.util.Scanner;

public class Potencias2 {
	public static boolean potencia2(int numero) {
		if (numero < 1) return false;

		while (numero > 1) {
			if (numero % 2 != 0)
				return false;
			numero = numero / 2;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		
		int qtdPotencias = 0;
		for (int i = 0; i < n; i++){
			int novoNumero = leitor.nextInt();
			if (potencia2(novoNumero)) qtdPotencias++;
		}	

		System.out.println(qtdPotencias);
	}
}

