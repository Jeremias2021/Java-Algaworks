package Cap_02_e_03_VariaveisEConstantes;
import java.util.Scanner;

public class NomeESobrenome {
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu Nome: ");
		String nome = scanner.nextLine();
		 
		System.out.println("Informe seu Sobrenome: ");
	    String sobrenome = scanner.nextLine();
	      
	    System.out.println(" Ol� o seu nome completo �: " +nome    +sobrenome);
	
		scanner.close();
	}
}
