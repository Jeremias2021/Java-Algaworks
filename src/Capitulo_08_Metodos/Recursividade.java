package Capitulo_08_Metodos;

import java.util.Scanner;

public class Recursividade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançado"}; 
		
		imprimir ("Escolha dentre os curos abaixos: ");
		
		iterarEExibirPosicaoDoVectorString(cursos);
		
		
		Integer posicaoCursosEscolhidos = receberNumeroInteiroDoUsario("O curso que voçê deseja é o: ",scanner);
		
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursosEscolhidos, cursos); 
		// posicaoCursosEscolhidos >= 0 && posicaoCursosEscolhidos < cursos.length;
		
		
		if(!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		imprimirTraco();
		
		String [] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir("Escolha as formas de Pagamento abaixo: ");
		
		iterarEExibirPosicaoDoVectorString(formasPagamento);
		
		
		
		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsario("Sua forma de pagamento escolhida é: ", scanner)
		;
		
		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		if(!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursosEscolhidos];
		String formaPagemntoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagemnto é " + formaPagemntoEscolhido);
		scanner.close();	
		}
	
	static Integer receberNumeroInteiroDoUsario(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero= scanner.nextInt();
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void iterarEExibirPosicaoDoVectorString(String[] vetor) {
	
	}
	static void iterarEExibirPosicaoDoVectorString(String[] vetor, Integer i ) {
		imprimir("[" + i + "] " + vetor[i]);
		
		if (++i < vetor.length) {
			iterarEExibirPosicaoDoVectorString(vetor, i);
		}
			
	}
		
	static void imprimirTraco() {
		imprimir("-----------------------------------------------------");
	   
    }
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posição Invalida");
		System.exit(1);
	}

 }

	