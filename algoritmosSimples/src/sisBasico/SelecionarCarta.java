package sisBasico;

import java.util.Random;
public class SelecionarCarta {

	public static void main(String[] args) {
		
		String [] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String [] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		Random r = new Random();//ESCOLHA RANDOMICA
		
		int indiceFace = r.nextInt(faces.length); //r � A VARIAVEL RANDOMICA nextInt � UM METODO
		String face = faces[indiceFace];		  // O METODO � nexiNT PORQUE ISSO TEM RELA��O COM A POSSI��O DOS ITENS E N�O COM O ITEM EM SI
		
		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];
		
		String carta = face + " " + nipe;
		System.out.println(carta);

	}

}
