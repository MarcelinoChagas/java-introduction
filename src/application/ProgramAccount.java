package application;

import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		String inicial;
		
		System.out.print("Enter account number: ");
		account.setNumber(input.nextDouble());
		input.nextLine();
		
		System.out.print("Enter account holder: ");
		account.setHolder(input.nextLine());
				
		System.out.print("Is there na initial deposit (y/n)? ");
		inicial = input.next();
		
		if(inicial.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			account.setValue(input.nextDouble());
		}
		account.account();
		
		System.out.print("\n\nEnter a deposit value: ");
		account.deposit(input.nextDouble());
		account.updateAccount();
		
		System.out.print("\n\nEnter a withdraw value: ");
		account.withdraw(input.nextDouble());
		account.updateAccount();
		
		input.close();
	}

}
