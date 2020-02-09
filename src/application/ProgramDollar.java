package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class ProgramDollar {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	CurrencyConverter currency = new CurrencyConverter();
	
	System.out.print("What is the dollar price? ");
	currency.dollar = input.nextDouble();
	System.out.print("How many dollars will be bought? ");
	currency.compra_dollar = input.nextDouble();
	
	currency.valueDollar(currency.dollar, currency.compra_dollar);
	
	input.close();
	}

}
