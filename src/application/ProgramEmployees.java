package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employees;

public class ProgramEmployees {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Employees employee = new Employees();
	List<Employees> list = new ArrayList<>();
	
	System.out.print("How many employees will be registered? ");
	int qtdEmployees = input.nextInt();
	
	for(int i = 1; i <= qtdEmployees; i++) {
		System.out.printf("\nRent #%d: ", i);
		System.out.print("\nId: ");
		employee.setId(input.nextInt());
		System.out.print("Name: ");
		input.nextLine();
		employee.setName(input.nextLine());
		System.out.print("Salary: ");
		employee.setSalary(input.nextDouble());
		
		list.add(new Employees(employee.getId(),employee.getName(),employee.getSalary()));		
	}
	
	System.out.print("\nEnter the employee id  that will have salary increase: ");
	int id = input.nextInt();
	
	Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	
	if(emp == null) {
		System.out.println("This id does not exist!");
	}else {
		System.out.print("Enter the percentage: ");
		double percentage = input.nextDouble();
		emp.increaseSalary(percentage);
	}
	
	System.out.println("List of employees: ");
	for(Employees obj : list) {
		System.out.println(obj);
	}
	
	
	input.close();

	}

}
