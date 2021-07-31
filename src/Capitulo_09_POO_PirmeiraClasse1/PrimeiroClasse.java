package Capitulo_09_POO_PirmeiraClasse1;

public class PrimeiroClasse {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Smarphone";
		produto.precoUnitario = 500.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);
	
	}
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quabtidade em estoque do produto " + produto.nome + " é de " + produto.quantidade + " unidade(s)");
		
	 }

   }

