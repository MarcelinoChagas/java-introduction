package entities;

public class CurrencyConverter {

	public double dollar;
	public double compra_dollar;
	public double total;
	
	
	public void valueDollar (double price, double manyDollars) {
		total = price * manyDollars;
		total = total * 0.06 + total;
		System.out.printf("Amount to be paid in reais = %.2f", total);
	}
	

}
