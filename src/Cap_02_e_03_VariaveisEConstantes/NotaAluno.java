package Cap_02_e_03_VariaveisEConstantes;
import java.util.Scanner;
public class NotaAluno {

	public static void main(String[] args) {
	
      Scanner scanner = new  Scanner(System.in);
		
	    System.out.println(" Digite a sua nota: ");
		double notaDoAluno = scanner . nextDouble ();
		
		Boolean passouDeAno = notaDoAluno >=  70 ;
		
		if (passouDeAno) {
			System.out.println(" Parab�ns! Voc� passou de ano.");
		} else {
			System.out.println(" Infelizmente, ficou de recupera��o.");
		}
		
		scanner.close();
		
	}

}
