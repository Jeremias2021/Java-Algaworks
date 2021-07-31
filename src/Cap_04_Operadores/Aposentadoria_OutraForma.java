package Cap_04_Operadores;

import  java.util.Scanner; 

      
  public class Aposentadoria_OutraForma {
	  final static int IDADE_MINIMA_PARA_APOSENTAR = 55;

      final  static int TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

	
	public  static  void  main ( String [] args ) {
		Scanner scanner =  new Scanner ( System.in);

		System.out.print(" Idade: ");
	    Integer Idade = scanner.nextInt ();
		
	    System.out.print(" Tempo de contribuição: ");
		Integer Contribuicao = scanner.nextInt();
		
		Boolean temIdadeParaAposentar = Idade >= IDADE_MINIMA_PARA_APOSENTAR;
		
		Boolean temTempoDeContribuicaoSuficiente = Contribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		
		Boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicaoSuficiente;
		
		if (podeAposentar) {
			System.out.println(" Sim! Pode aposentar. ");
		} else {
			System.out.println(" Não vai ser possível aposentar agora. ");
		}
		
		scanner.close();
	}

}
