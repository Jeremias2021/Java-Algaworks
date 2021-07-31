package Cap_02_e_03_VariaveisEConstantes;
import java.util.Scanner;
public class CalculoQuadrado {

	public static void main(String[] args) {
	
    Scanner scanner = new Scanner(System.in);
		    
    System.out.print("Digite o numero: ");
		    Double numero = scanner.nextDouble();

		    double quadrado = numero * numero;
		
		System.out.print( " O quadrado de "  + numero +  " é "  + quadrado +  " . ");
		
		scanner.close();
	}

}
