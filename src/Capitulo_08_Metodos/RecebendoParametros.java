package Capitulo_08_Metodos;

import java.util.Scanner;

public class RecebendoParametros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançado"}; 
		
		System.out.println("Escolha dentre os curos abaixos: ");
		
		iterarEExibirPosicaoDoVectorString(cursos);
		
		System.out.println("O curso que voçê deseja é o: ");
		Integer posicaoCursosEscolhidos = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursosEscolhidos >= 0 && posicaoCursosEscolhidos < cursos.length;
		
		if(!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		imprimirTraco();
		
		String [] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha as formas de Pagamento abaixo: ");
		
		iterarEExibirPosicaoDoVectorString(formasPagamento);
		
		System.out.println("Sus forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if(!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursosEscolhidos];
		String formaPagemntoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagemnto é " + formaPagemntoEscolhido);
		scanner.close();	
	}
	
	static void iterarEExibirPosicaoDoVectorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
//			System.out.println( i + "." + vetor[i]);
		}
		
	}
	
	static void imprimirTraco() {
	   System.out.println("-----------------------------------------------------");
	   
    }
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posição Invalida");
		System.exit(1);
	}
}
