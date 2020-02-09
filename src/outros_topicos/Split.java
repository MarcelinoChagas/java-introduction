package outros_topicos;

public class Split {

	public static void main(String[] args) {
		String teste = "Marcelino Francisco Gomes das Chagas";
		
		String[] vector = teste.split(" ");
		
		for(int i = 0;i < vector.length; i++) {
			System.out.println(vector[i]);	
		}
		

	}

}
