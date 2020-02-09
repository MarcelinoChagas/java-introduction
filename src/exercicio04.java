import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num_funcionario, horas;
		double valor_hora;
		
		System.out.print("Digite o nº do funcionário: ");
		num_funcionario = input.nextInt();
		System.out.print("Digite a qtd de horas trabalhadas pelo profissional: ");
		horas = input.nextInt();
		System.out.print("Digite o valor da hora: ");
		valor_hora = input.nextDouble();
		
		System.out.printf("Nº do Funcinário: %d\nSalário: U$ %.2f",num_funcionario,(valor_hora * horas));
		
		input.close();
	}

}
