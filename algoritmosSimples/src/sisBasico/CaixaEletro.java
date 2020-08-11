package sisBasico;

import java.util.Scanner;
public class CaixaEletro {
public static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int opcao;
		
		System.out.println("Operacoes!!!");
		System.out.println("1 Saldo em conta corrente");
		System.out.println("2 Extrato bancario");
		System.out.println("3 Sacar Dinheiro");
		System.out.println("4 Transferencia");
		
		System.out.print("Entre com uma opcao:");
		opcao = entrada.nextInt();
		
		switch(opcao){
		case 1:
			System.out.print("Saldo");
			break;
		case 2:
			System.out.print("Extrato");
			break;
		case 3:
			System.out.print("Saque");
			break;
		case 4:
			System.out.print("Transferencia");
			break;
		default:
			System.out.print("Opcao invalida!!");
		}
		

	}

}
