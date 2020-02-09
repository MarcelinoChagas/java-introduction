package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double NetSalary() {
		return (this.grossSalary - this.tax);
	}

	public void IncreaseSalary(double percentage) {
		percentage = ((percentage / 100) * grossSalary);
		System.out.printf("Update data: %s, $%.2f", name, (this.grossSalary + percentage - this.tax));
	}
}
