package array;

import java.util.ArrayList;
public class VetorList {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		cores.add("Preto");
		cores.add("Azul");
		cores.add("Vermelho");
		
		System.out.println("Tamanho: " + cores.size());
		System.out.println("Elemento 2: " + cores.get(2));
		System.out.println("Indice Azul: " + cores.indexOf("Azul"));
		
		cores.remove("Preto");
		
		System.out.println("Tem cor Preta ?" + cores.contains("Preto"));
		

	}

}
