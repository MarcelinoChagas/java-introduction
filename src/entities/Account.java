package entities;

public class Account {
	private double number;
	private String holder;
	private double value;
	
	public Account() {
	}
	
	public Account(double number, String holder, double value) {
		super();
		this.number = number;
		this.holder = holder;
		this.value = value;
	}
	
	public Account(double value) {
		this.value = 0;
	}
	
	public double getNumber() {
		return number;
	}
	
	public void setNumber(double number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void deposit(double value) {
		this.value += value;
	}
	
	public void withdraw(double value) {
		this.value -= value + 5;
	}
	
	public void account() {
		System.out.println("\nAccount Data: ");
		System.out.printf("Account %.2f, Holder: %s, Balance: $ %.2f", getNumber(), getHolder(),getValue());
	}
	
	public void updateAccount() {
		System.out.println("Update account data: ");
		System.out.printf("Account %.2f, Holder: %s, Balance: $ %.2f", getNumber(), getHolder(),getValue());
	}
}
