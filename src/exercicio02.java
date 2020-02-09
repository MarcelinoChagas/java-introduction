import java.util.Scanner;


public class exercicio02 {

	public static void main(String[] args) {
		Scanner put = new Scanner(System.in);
		
		double raio;
		double area;
		
		System.out.print("Digite o valor do Raio: ");
		raio = put.nextDouble();
		
		area = Math.PI * (Math.pow(raio,2));
		
		System.out.printf("Valor da Área: %.4f", area);
		
		put.close();
	}

}
