package Cap_02_e_03_VariaveisEConstantes;
import java.util.Scanner;
public class ExercicioConstantes {
	
	static final Integer NOTA_MINIMA_PARA_PRA_PASSAR = 70;

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		
	    System.out.print(" Digite a sua nota: ");
		Double notaDoAluno = scanner.nextDouble();
		
		
		Boolean passouDeAno = notaDoAluno >= NOTA_MINIMA_PARA_PRA_PASSAR; 
		if (passouDeAno) {
			System.out.println(" Parabéns! Você passou de ano.");
		} else {
			System.out.println(" Infelizmente, ficou de recuperação.");
		}
		
		scanner.close();

	}

}
