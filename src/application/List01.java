package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Marcelino");
		list.add("Chagas");
		list.add("Gomes");
		list.add("Edla");		
		list.add(2, "Marcela");
		
		System.out.println(list.size());
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Index of Chagas: "+list.indexOf("Chagas"));
		System.out.println("Index of Edla: "+ list.indexOf("Edla"));
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String x: result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
		System.out.println(name);
	}

}
