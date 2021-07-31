package Capitulo_08_Metodos;

import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançado"}; 
		
		System.out.println("Escolha dentre os curos abaixos: ");
		
		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] " + cursos[i]);
		}
		
		System.out.println("O curso que voçê deseja é o: ");
		Integer posicaoCursosEscolhidos = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursosEscolhidos >= 0 && posicaoCursosEscolhidos < cursos.length;
		
		if(!posicaoValida) {
			System.err.println("Posição invalida");
			System.exit(1);
		}
		
		imprimirTraco();
		
		String [] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha as formas de Pagamento abaixo: ");
		
		
		for(int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "] " + formasPagamento[1]);
		}
		
		System.out.println("Sus forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if(!posicaoValida) {
			System.err.println("Posição Invalida");
			System.exit(1);
		}
		
		String cursoEscolhido = cursos[posicaoCursosEscolhidos];
		String formaPagemntoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagemnto é " + formaPagemntoEscolhido);
		scanner.close();	
	}
	static void imprimirTraco() {
	   System.out.println("-----------------------------------------------------");
	   
   }
}
