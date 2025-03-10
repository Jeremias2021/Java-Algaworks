package Capitulo_08_Metodos;
import java.util.Scanner;

public class Exercicio_8_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		Double numeroEsquerda = informeNumero(scanner);
		
		imprimirTraco();
		
		Integer Operac�o = escolhaAOperacao(scanner);
		
		imprimirTraco ();
		
		Double numeroDireita = informeNumero(scanner);
		
		imprimirTraco ();
		
		Double resultado = realizarCalculo (Operac�o, numeroEsquerda, numeroDireita);
		
		System.out.println( " O resultado �: "  + resultado);
		
		scanner.close();
	}	
	
	static Double realizarCalculo(Integer operacao, Double numeroEsquerda, Double numeroDireita) {
		Double resultado = null;
		
		switch(operacao) {
		case 0 :
			resultado = subtracao(numeroEsquerda, numeroDireita);
			break;
		case  1 :
			resultado = adicao(numeroEsquerda, numeroDireita);
			break;
		default :
			System.err.println(" Escolha uma opera��o v�lida! ");
			System.exit(0);
		}
		
		return resultado;
	}
	
	 static Double subtracao( Double numeroEsquerda, Double numeroDireita) {  
		return numeroEsquerda - numeroDireita;
	}
	
	static Double  adicao (Double  numeroEsquerda , Double  numeroDireita) {
		return numeroEsquerda + numeroDireita;
	}
	
	static  Integer  escolhaAOperacao (Scanner  scanner ) {
		System.out.println( " ESCOLHA A OPERA��O " );
		
		String[] operacoes = new String [] {" Subtra��o " , " Adi��o "};
		
		for (int i = 0; i < operacoes.length; i ++ ) {
			System.out.println(" [ "  + i +  " ] "  + operacoes[i]);
		}
		
		System.out.print(" Digite a opera��o: ");
		
		return scanner.nextInt ();
	}
	
	static  Double  informeNumero (Scanner Scanner) {
		System.out.print( " Informe o n�mero: " );
		return Scanner.nextDouble ();
	}
	
	static  void  imprimirTraco() {
		System.out.println(" --------------------------------------- " );
	}

}

