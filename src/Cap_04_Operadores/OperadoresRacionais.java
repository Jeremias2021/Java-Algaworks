package Cap_04_Operadores;

public class OperadoresRacionais {
	
	public static void main(String[] arg) {
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2? " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2? " + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		Boolean tresMenorOuIgualATres = 3 <= 3;
		System.out.println("3 <= 3? " + tresMenorOuIgualATres);
		
//		Boolean doisIgualADOis = 2 == 2;
//		System.out.println("2 == 2?" +doisIgualADOis);
//		
//		Boolean doisDiferenteDeDOis = 2 != 2;
//		System.out.println("2 != 2?" +doisDiferenteDeDOis);
		
		Integer quatro = 4;
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("quatro > quatro?" + quatroMaiorQueQuatro);
		
		Boolean quatroMaiorOuIgualAQuatro = quatro >= quatro;
		System.out.println("quatro >= quatro?" + quatroMaiorOuIgualAQuatro);
	    
		Integer cinco = 5;
		Boolean cincoIgualACinco = cinco.equals(cinco);
		System.out.println("cinco.equals(cinco)?" + cincoIgualACinco);
		
		Integer seis = 6;
		Boolean seisIgualASeis = seis.equals(seis);
		System.out.println("seis.equals(seis)?" + seisIgualASeis);
		
		Integer centoVinteOito = 128;
		Integer centoVinteOito02 = 128;
		Boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
	    System.out.println("centoVinteOito.equals(centoVinteOito02)?" + centoVinteOitoIgualCentoVinteOito);
	    
	    Boolean centoVinteOitoIgualCentoVinteOinte02 =  centoVinteOito == centoVinteOito02;
	    System.out.println("centoVinteOitoequals(centoVinteOito02)? " + centoVinteOitoIgualCentoVinteOinte02);
			
	}

}
