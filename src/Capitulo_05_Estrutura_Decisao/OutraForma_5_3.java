package Capitulo_05_Estrutura_Decisao;
import java.util.Scanner;
public class OutraForma_5_3 {
	
	 final static Double NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
		
	 final static Double NOTA_MINIMA = 60.0;
	
	public  static  void  main ( String [] args ) {
		Scanner scanner =  new  Scanner(System.in);
		
		System.out.print(" VERIFICANDO SE TEM NOTA SUFICIENTE PARA CONCURSO.");
		
		System.out.print("Portugu�s: ");
		Double notaDePortugues = scanner.nextDouble();
		
		System.out.print("Matem�tica: " );
		Double notaDeMatematica = scanner . nextDouble ();
		
		Boolean estaAcimaDoMinimoEmPortugues = notaDePortugues >= NOTA_MINIMA ;
		
		Boolean estaAcimaDoMinimoEmMatematica = notaDeMatematica >= NOTA_MINIMA ;
		
		Double notaTotal = notaDePortugues + notaDeMatematica;
		
		Boolean temNotaParaPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL ;
		
		Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;

		if (passou) {
			System.out.println( " Parab�ns! Voc� passou. " );
		} else {
			System.out.println( " Infelizmente, n�o foi dessa vez. " );
		}
		
		scanner.close();

   }
}
