package Capitulo_08_Metodos;

import java.util.Scanner;

public class RecebendoParametros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avan�ado"}; 
		
		System.out.println("Escolha dentre os curos abaixos: ");
		
		iterarEExibirPosicaoDoVectorString(cursos);
		
		System.out.println("O curso que vo�� deseja � o: ");
		Integer posicaoCursosEscolhidos = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursosEscolhidos >= 0 && posicaoCursosEscolhidos < cursos.length;
		
		if(!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		imprimirTraco();
		
		String [] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		System.out.println("Escolha as formas de Pagamento abaixo: ");
		
		iterarEExibirPosicaoDoVectorString(formasPagamento);
		
		System.out.println("Sus forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if(!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursosEscolhidos];
		String formaPagemntoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagemnto � " + formaPagemntoEscolhido);
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
		System.err.println("Posi��o Invalida");
		System.exit(1);
	}
}
