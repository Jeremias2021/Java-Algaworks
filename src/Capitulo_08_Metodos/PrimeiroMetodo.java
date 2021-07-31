package Capitulo_08_Metodos;

import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avan�ado"}; 
		
		System.out.println("Escolha dentre os curos abaixos: ");
		
		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] " + cursos[i]);
		}
		
		System.out.println("O curso que vo�� deseja � o: ");
		Integer posicaoCursosEscolhidos = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursosEscolhidos >= 0 && posicaoCursosEscolhidos < cursos.length;
		
		if(!posicaoValida) {
			System.err.println("Posi��o invalida");
			System.exit(1);
		}
		
		imprimirTraco();
		
		String [] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		System.out.println("Escolha as formas de Pagamento abaixo: ");
		
		
		for(int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "] " + formasPagamento[1]);
		}
		
		System.out.println("Sus forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if(!posicaoValida) {
			System.err.println("Posi��o Invalida");
			System.exit(1);
		}
		
		String cursoEscolhido = cursos[posicaoCursosEscolhidos];
		String formaPagemntoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagemnto � " + formaPagemntoEscolhido);
		scanner.close();	
	}
	static void imprimirTraco() {
	   System.out.println("-----------------------------------------------------");
	   
   }
}
