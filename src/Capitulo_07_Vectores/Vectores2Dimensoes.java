package Capitulo_07_Vectores;

public class Vectores2Dimensoes {

	public static void main(String[] args) {
//		Double facturamentoDia = 1000.0;
		
		Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double[] faturamentoFevereiro = new Double[] { 1000.0, 2500.0, 1000.0 };
		
		Double[][] faturamentoAnual = new Double [][] { faturamentoJaneiro, faturamentoFevereiro};
		
//		System.out.println("faturamento do dia 1º de Janeiro: " + faturamentoAnual[0][0] );
//		System.out.println("faturamento do dia 3 de Fevereir: " + faturamentoAnual[1][2] );
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));
			
			Double[] mes = faturamentoAnual[1];
			
			for(int y = 0; y < mes.length; y++) {
				Double dia = mes[y];
				System.out.println("Dia " + (y + 1) + ": " + dia);
			}
		}
	}

}
