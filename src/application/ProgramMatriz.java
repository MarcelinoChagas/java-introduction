package application;

import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0;i<mat.length; i++) {
			for(int j=0;j<mat[i].length; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Number Negatives: "+ count);
		input.close();
	}

}
