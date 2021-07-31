package Capitulo_09_POO_Exercicio1;

public class Exercicio1 {

		public  static  void  main ( String [] args ) {
			
			Produto produto =  new Produto();
			produto.nome =  "Notebook XZ10" ;
			produto.QuantidadeEstoque = 8;
			
			System.out.println( " Necessário repor estoque do produto "  + produto.nome +  " ? "  + eNecessarioReporEstoque (produto));
		}
		
		static Boolean eNecessarioReporEstoque ( Produto  produto ) {
			if (produto.QuantidadeEstoque <  Produto.QUANTIDADE_MINIMA_ESTOQUE ) {
				return  true ;
			}
			
			return  false ;
		}

	}


