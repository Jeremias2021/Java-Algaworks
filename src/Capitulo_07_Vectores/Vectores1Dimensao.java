package Capitulo_07_Vectores;

import java.util.Scanner;

public class Vectores1Dimensao {

	public static void main(String[] args) {
//		String[] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto"};
//		
//		System.out.println("Escolha o sabor:");
//		
//		for(int i = 0; i< cardapio.length; i++) {
//			System.out.println("["+ i + "] " + cardapio[1]);
//		}
		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Digite o numero referente ao sabor: ");
//		Integer saborEscolhido = scanner.nextInt();
//		
//		System.out.println("Voçê escolheu o sabor: " + cardapio[saborEscolhido]);
//		scanner.close();
		
//		String[] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto"};
//		cardapio[3] = "Frango";
//		
//		for(int i = 0; i< cardapio.length; i++) {
//			System.out.println(cardapio[i]);
//     	}
		
		String[] cardapio = new String[4];
		cardapio[0] ="Calabresa";
		cardapio[1] ="Atum";
		cardapio[2] ="Queijo";
		cardapio[3] ="Presunto";
		
		for(int i = 0; i< cardapio.length; i++) {
			System.out.println(cardapio[i]);
     	}
		
		scanner.close();
	}

}
