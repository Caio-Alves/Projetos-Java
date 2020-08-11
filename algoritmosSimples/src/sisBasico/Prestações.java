package sisBasico;

import java.util.Scanner;
public class Prestações {
public static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int pres, pres_pagos, pres_restant;
		double pres_preco, sal_dev;
		
		System.out.print("Entre com o numero total de prestações:");
		pres = entrada.nextInt();
		
		System.out.print("Entre com o total de Prestações pagos:");
		pres_pagos = entrada.nextInt();
		
		System.out.print("Entre com o valor unitario da prestação:");
		pres_preco = entrada.nextDouble();
		
		pres_restant = pres - pres_pagos;
		sal_dev = pres_preco * pres_restant;
		
		System.out.println("Restam " + pres_restant + " prestações e o valor total a pagar é: " + sal_dev);
		
	}

}
