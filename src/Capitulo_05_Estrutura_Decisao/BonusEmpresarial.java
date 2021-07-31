package Capitulo_05_Estrutura_Decisao;
import java.util.Scanner;
public class BonusEmpresarial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Valor da Meta de Faturamento Anual: ");
		Double metaAnual = scanner.nextDouble();
		
		System.out.print("Digite o Valor do Faturamento Real ");
		Double faturamentoReal = scanner.nextDouble();
		 
		System.out.println("Digite e media Salarial: ");
		//Double mediaSalarial = scanner.nextDouble();
		
		
		if(faturamentoReal >= metaAnual) {
			System.out.println("Ganharão Bônus");
			//System.out.println(mediaSalarial );
		} else if((faturamentoReal < metaAnual)){
			System.out.println("Não ganharão Bônus");

		}
		
		scanner.close();

	}

}
