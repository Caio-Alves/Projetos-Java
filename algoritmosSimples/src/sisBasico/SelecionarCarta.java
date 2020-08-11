package sisBasico;

import java.util.Random;
public class SelecionarCarta {

	public static void main(String[] args) {
		
		String [] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String [] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		Random r = new Random();//ESCOLHA RANDOMICA
		
		int indiceFace = r.nextInt(faces.length); //r É A VARIAVEL RANDOMICA nextInt É UM METODO
		String face = faces[indiceFace];		  // O METODO É nexiNT PORQUE ISSO TEM RELAÇÃO COM A POSSIÇÃO DOS ITENS E NÃO COM O ITEM EM SI
		
		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];
		
		String carta = face + " " + nipe;
		System.out.println(carta);

	}

}
