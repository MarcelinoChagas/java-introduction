package application;

import java.util.Scanner;

import entities.Employee;

public class ProgramaEmployee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double taxa;
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = input.nextLine();
		System.out.printf("Gross salary: ");
		employee.grossSalary = input.nextDouble();
		System.out.printf("Tax: ");
		employee.tax = input.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f", employee.name, employee.NetSalary());
		
		System.out.print("\nWhich percentage to increase salary? ");
		taxa = input.nextDouble();
		
		employee.IncreaseSalary(taxa);
		
		input.close();

	}

}
