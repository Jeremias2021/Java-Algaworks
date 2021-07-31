package Cap_02_e_03_VariaveisEConstantes;

import java.util.Scanner;

public class ValorProduto {

		public  static  void  main ( String [] args ) {
			Scanner scanner =  new Scanner(System.in);
			
			System.out.print( " Digite o valor do produto: " );
			double valorProduto = scanner . nextDouble ();
			
			System.out.print( " Digite a quantidade: " );
			int quantidade= scanner.nextInt();
			
			Double valorSubtotal = valorProduto * quantidade;
			
			Boolean quantidadeMaiorOuIgualDez = quantidade >=  10 ;
			
			double percentualDesconto = 0;
			
			if (quantidadeMaiorOuIgualDez) {
				percentualDesconto =  10;
			}
			
			double desconto = valorSubtotal * percentualDesconto /  100 ;
			
			double valorTotalComDesconto = valorSubtotal - desconto;
			
			System.out.println( " Valor total: "  + valorTotalComDesconto);
			
			scanner.close();
		}
	}