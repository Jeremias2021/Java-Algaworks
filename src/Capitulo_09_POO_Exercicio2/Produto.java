package Capitulo_09_POO_Exercicio2;

public class Produto {
	
	 final static Integer QUANTIDADE_MINIMA_ESTOQUE = 10 ; // Essa n�o � uma vari�vel e sim, uma constante.   
	
	 String nome;
	
	 Integer quantidadeEstoque;
	
	 Boolean  eNecessarioReporEstoque () {
		if(quantidadeEstoque <  Produto.QUANTIDADE_MINIMA_ESTOQUE ) {
			return true ;
		}
		
		return  false ;
	}
}
