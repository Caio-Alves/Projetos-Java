package sisBasico;

public class SequenciaFibo {

	public static void main(String[] args) {
		
	
		int anterior = 0;
		int proximo = 1;
		
		
		while(proximo < 50) {
			
			System.out.println(anterior);
			
			proximo = proximo + anterior;
			anterior = proximo - anterior;
			
			//PARA ENTENDER MELHOR FAÇA TESTE DE MESA
		}
	}
}
