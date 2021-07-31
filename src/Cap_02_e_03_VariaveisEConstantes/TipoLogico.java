package Cap_02_e_03_VariaveisEConstantes;

public class TipoLogico {
	public static void main(String [] args) {
		boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		
		boolean variavelFalsa = false;
		System.out.println("Variavel false: " + variavelFalsa);
		
		System.out.println("--------------------------------------");
		
		int idade = 20;
		boolean podeTirarCarteira = idade >= 18;
		// System.out.println("Pode tirar Carteira? " + podeTirarCarteira);
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira.");
		} else {
			System.out.println("Não! Ele(a) não pode tirar carteira.");
		}
	}

}
