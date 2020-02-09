package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite nº Linhas: ");
		int m = input.nextInt();
		System.out.print("Digite nº Colunas: ");
		int n = input.nextInt();
		
		int [][] mat = new int[m][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<mat.length; i++) {
			System.out.println();
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j]+ "  ");
			}
		}
		//int count=0;
		System.out.print("\n\nProcurar o numero: ");
		int found = input.nextInt();

		for(int i=0; i<mat.length; i++) {			
			for(int j=0; j<mat[i].length; j++) {
				if(found == mat[i][j] ) {
					System.out.printf("\nPosition: %d, %d ",i,j);
					if(j>0) {
						System.out.printf("\nLeft: %d", mat[i][j-1]);
					}					
					if(i>0) {
						System.out.printf("\nUp: %d", mat[i-1][j]);
					}
					if(j < mat[i].length-1) {
						System.out.printf("\nRigth: %d", mat[i][j+1]);
					}					
					if(i < mat[i].length-1) {
						System.out.printf("\nDown: %d", mat[i+1][j]);
					}
				}
			}
		}
		
		input.close();
	}

}
