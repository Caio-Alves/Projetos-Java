package sisBasico;

import java.util.Scanner;

public class ValDelta {
	public static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner (System.in);
		
		double a, b, c;
		
		System.out.print("Informe valor de a:");
		a = entrada.nextDouble();
		
		System.out.print("Informe valor de b:");
		b = entrada.nextDouble();
		
		System.out.print("Informe valor de c:");
		c = entrada.nextDouble();
		
		double delta = Math.pow(b,2) - 4*a*c;
		
		System.out.println("Delta = " + delta);
	}

}
