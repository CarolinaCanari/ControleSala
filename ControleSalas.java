package ControleSalas;

import java.util.Scanner;

public class ControleSalas {

	public static void main(String[] args) {
		
		System.out.println("Inserir n�mero da sala");
		
		do {
			
		Scanner lojas = new Scanner (System.in);
		int consulta = lojas.nextInt();
		
		if (consulta >= 200) {
			System.out.println("Loja inv�lida. \nInsira outra valor: ");
		} 		
		else if (consulta == 13 || consulta == 27 || consulta == 27 || consulta == 28 || consulta == 42 || consulta == 55 ||  consulta == 57 ||  consulta == 65  ||  consulta == 67 ) {
			System.out.println("Ocupada! \nInserir novo n�mero da sala");
		} 
		
		else {
			System.out.println("Livre! \nInserir novo n�mero da sala");
		}
		
		
		
		}
		
		while ("consulta" != null);	
		
		
		
	}
	

}
