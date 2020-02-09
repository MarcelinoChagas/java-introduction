package estrutura_condicional;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x; 
		System.out.print("Digite um número: ");
		x = input.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		input.close();
	}

}
