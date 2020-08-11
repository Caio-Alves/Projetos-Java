
package array;

import java.util.Arrays; //PARA UTILIZAR A INSTRUCAO ARRAYS � NECESSARIO IMPORTAR CLASSE
public class VetorSimples {


	public static void main(String[] args) {
		
		String [] paises = {"Brasil","Russia","India","Japao","Catalunia"};
		
		System.out.println(Arrays.toString(paises)); //L� O CONTEUDO DO VETOR
/*----------------------------------------------------------------------------------------------  */		
		int posi��o = Arrays.binarySearch(paises, "India"); //PESQUISA POSI��O DE ITEM ESCOLHIDO
		System.out.println(posi��o);
/*----------------------------------------------------------------------------------------------  */
		Arrays.sort(paises,0,paises.length); //ORDENA O VETOR DA POSICAO 0 ATE O ULTIMO ELEMENTO (PAISES.LENGTH)
		System.out.println(Arrays.toString(paises));
/*----------------------------------------------------------------------------------------------  */
		Double[] valores = {12.35, 457.45, 97.32};
		System.out.println(valores[1].doubleValue()); //L� O VETOR DA POSICAO ESCOLHIDA 
	}
}
