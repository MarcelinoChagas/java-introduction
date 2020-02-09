package application;

import java.util.Scanner;

import entities.Rectangle;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.print("Digite a Largura: ");
		rectangle.width = input.nextDouble();
		System.out.print("Digite a Altura: ");
		rectangle.height = input.nextDouble();
		
		System.out.printf("AREA = %.2f", rectangle.area());
		System.out.printf("\nPERIMETER = %.2f", rectangle.perimeter());
		System.out.printf("\nDIAGONAL = %.2f", rectangle.diagonal());
		
		input.close();
	}

}
