package Capitulo_06_Iteracao;

public class IteracaoFor {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 5; i++){
//			System.out.println( i + ": Uma frase qualquer.");
//		}
		
//		Double[] carrinhoDeCompra = new Double[] { 50.0, 51.0, 53.0 };
//		Double total = 0.0;
//		
//		for(int i = 0; i <= carrinhoDeCompra.length; i++) {
//			System.out.println("Itera��o: " + i + ", Total: " + total);
//			total = total + carrinhoDeCompra[i];
//		}
//		
//		System.out.println("Total: " + total);
//	}
		
		
//		for (int i = 0; i< 10; i++) {
//			if( i== 5) {
//				System.out.println("Vai parar!");
//				break;
//			}
//			System.out.println("Itera���: " + i);
//		}
		
//		for (int i = 0; i< 10; i++) {
//			if( i == 5) {
//				System.out.println("Vai continuar!");
//				continue;
//			}
//			System.out.println("Itera���: " + i);
//		}
		Integer[] produtos = new Integer[] { 100, 225, 300};
		
		for (int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			
			System.out.println("Produto de c�digo: " + produto);
			
			if (produto.equals(225)) {
				System.out.println("Produto encontrado!");
				break;
			}
			
		}
	}
 }