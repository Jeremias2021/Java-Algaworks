package Capitulo_08_Metodos;

import java.util.Scanner;

public class EscolhendoBonsNomes {
	public  static  void  main ( String [] args ) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco ();
		
		String cursoEscolhido = recebeCursoDoUsuario(scanner);
		
		imprimirTraco ();
		
		String formaPagamentoEscolhida = recebeFormaPagamentoDoUsuario(scanner);
		
		imprimirTraco ();
		
		imprimir ( " O curso escolhido foi "  + cursoEscolhido +  " e a forma de pagamento � "  + formaPagamentoEscolhida);
		
		scanner.close();
	}
	
	static  String  recebeFormaPagamentoDoUsuario ( Scanner  scanner ) {
		String [] formasPagamento =  new String[] { " Cart�o " , " Boleto " };
		
		imprimir ( " Escolha dentre as formas de pagamento abaixo: " );
		
		iterarEExibirPosicoesDoVetorString (formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario (formasPagamento, " Sua forma de pagamento escolhida �: " , scanner);
		
		return formasPagamento [posicaoFormaPagamentoEscolhida];
	}
	
	static String recebeCursoDoUsuario (Scanner scanner) {
		String [] cursos = new String [] { " Java EE " , " Spring " , " Java OO Avan�ado " };
		
		imprimir ( " Escolha dentre os cursos abaixo: " );
		
		iterarEExibirPosicoesDoVetorString(cursos);

		Integer Numero = receberIndiceValidoDoUsuario (cursos, " O curso que voc� deseja � o: " , scanner);
		
		return cursos [Numero];
	}
	
	static  Integer  receberIndiceValidoDoUsuario ( String [] vetor , String  texto , Scanner  scanner ) {
		Integer posicaoEscolhida = recebeNumeroInteiroDoUsuario(texto, scanner);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario (posicaoEscolhida, vetor);
		
		if ( ! posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida ();
		}
		
		return posicaoEscolhida;
	}
	
	static  Integer  recebeNumeroInteiroDoUsuario ( String  texto , Scanner  scanner ) {
		imprimirEContinuarNaMesmaLinha (texto);
		Integer numero = scanner . nextInt ();
		
		return numero;
	}
	
	static  Boolean  verificarPosicaoEscolhidaPeloUsuario ( Integer  posicao , String [] vetor ) {
		Boolean valida = posicao >=  0  && posicao < vetor.length;
		return valida;
	}
	
	static  void  imprimir ( String  texto ) {
		System.out.println(texto);
	}
	
	static  void  imprimirEContinuarNaMesmaLinha ( String  texto ) {
		System.out.println(texto);
	}
	
	static  void  iterarEExibirPosicoesDoVetorString ( String [] vetor ) {
		iterarEExibirPosicoesDoVetorString (vetor, 0 );
	}
	
	static  void  iterarEExibirPosicoesDoVetorString ( String [] vetor , Integer  i ) {
		imprimir ( " [ "  + i +  " ] "  + vetor [i]);
		
		if ( ++ i < vetor.length) {
			iterarEExibirPosicoesDoVetorString (vetor, i);
		}
	}
	
	static  void  imprimirTraco () {
		imprimir ( " ---------------------------------------------- " );
	}
	
	static  void  encerrarProgramaPorCausaDaPosicaoInvalida () {
		System.err.println( " Posi��o inv�lida! " );
		System.exit( 1 );
	}	


 }

	