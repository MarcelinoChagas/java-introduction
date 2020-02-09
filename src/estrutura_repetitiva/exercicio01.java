package estrutura_repetitiva;
import java.util.Scanner;
public class exercicio01 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int senha;
		 System.out.print("Digite sua senha: ");
		 senha = input.nextInt();
		 
		 while(senha != 2002) {
			 System.out.print("Senha Inválida\nDigite novamente: ");
			 senha = input.nextInt();			 
		 }
		 System.out.println("Acesso Permitido");
		 
		 input.close();
	}

}
