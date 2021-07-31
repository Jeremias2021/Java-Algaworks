package Cap_04_Operadores;

public class OperadoresLogicos {
	
	
	public static void main(String[] arg) {
		
		
		Boolean carrinhoMaiorQue100 = false;
		Boolean periodoDePromocao = true;
		Boolean  jaFezCompraNaLoja = false;
		Boolean pagamentoAVista = true;
	
//		Boolean aplicarDesconto = carrinhoMaiorQueCem && periodoDePromocao; 
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
//		Boolean aplicarDesconto  =  periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto  =  periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
		
		
		Boolean aplicarDesconto  =  periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
		
		if(aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
			
		} else {
			System.out.println("Não, Aplique o desconto.");
			
		}
		
	}

}
