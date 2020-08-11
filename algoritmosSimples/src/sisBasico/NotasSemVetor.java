package sisBasico;

import java.util.Scanner;
public class NotasSemVetor {
public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		double aluno, notas, soma=0, media=0;
		
		
		System.out.print("Digite a Quantidade de Alunos: ");
		aluno=entrada.nextDouble();
		System.out.println("\nDigite as notas do alunos!!");
		
		for(int i=0;i<aluno;i++) {
			System.out.print(1+i+": ");
			notas=entrada.nextDouble();
			
			soma=notas+soma; //PRESTAR ATENÇÃO
			media=soma/aluno;
			
		}
		System.out.print("A soma he: "+soma);
		System.out.print("\nA soma he: "+media);
	}

}
