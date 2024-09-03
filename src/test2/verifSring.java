package test2;

import java.util.Scanner;

public class verifSring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um texto ou uma palavra");
		String texto = sc.nextLine();
		
		int quantidade = contaA(texto);
		
		if(quantidade > 0) {
			System.out.println("A letra (A ou a) aparece "+ quantidade + "vezes");
		}
		else {
			System.out.println("A letra (A ou a) não aparece ");
		}
		
		sc.close();
	}

	public static int contaA(String texto) {
		int contador = 0;
		
		String textoMin = texto.toLowerCase();
		
		for(int i = 0; i < texto.length(); i++) {
			if(textoMin.charAt(i) == 'a') {
				contador++;
			}
		}
		return contador;
	}
}
