package Capitulo_05_Estrutura_Decisao;

public class EstruturaIf {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
//		Boolean movimentacaoPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContatemTemposSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
//		Boolean liberarEmprestimo = movimentacaoPeloMenosMetadeDoValor 
//				&& aContatemTemposSuficienteDeAbertura && temNomeLimpo;
		
		if((movimentacaoMedia * 2) >= emprestimo
		&& aContatemTemposSuficienteDeAbertura && temNomeLimpo) {
			System.out.println("Sim! Pode liberar emprestimo.");
		} else {
			System.out.println("Não pode liberar o empréstimo");
		}
		

	}

}
