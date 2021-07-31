package Capitulo_07_Vectores;

public class VectoresMaisDe2Dimensoes {

	public static void main(String[] args) {
//		Double facturamentoDia = 1000.0;
		
		Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double[] faturamentoFevereiro = new Double[] { 1000.0, 2500.0, 1000.0 };
		
		Double[][] faturamentoAnual = new Double [][] {faturamentoJaneiro, faturamentoFevereiro};
		
		Double [][][] faturamentoQuinquenal = new Double [][][] {faturamentoAnual};
		
		Double [][][][]  faturamentoDaDecada = new Double [][][][] {faturamentoQuinquenal};
		
	   System.out.println(" O Facturamento é: " + faturamentoDaDecada); // Fiz so pra tirar um erro
	
		
//		for (int i = 0; i < faturamentoAnual.length; i++) {
//			System.out.println("Mês: " + (i + 1));
//			
//			Double[] mes = faturamentoAnual[1];
//			
//			for(int y = 0; y < mes.length; y++) {
//				Double dia = mes[y];
//				System.out.println("Dia " + (y + 1) + ": " + dia);
//			}
//		}
	}

}
