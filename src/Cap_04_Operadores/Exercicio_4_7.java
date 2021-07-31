package Cap_04_Operadores;
import java.util.Scanner;
public class Exercicio_4_7 {
	// e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Luz: ");
	Double contaLuz = scanner.nextDouble();
	
	System.out.print("Água: ");
	Double contaAgua = scanner.nextDouble();
	
	System.out.print("Telefone: ");
	Double contaTelefone = scanner.nextDouble();
	
	System.out.print("Escola de Filho: ");
	Double escolaFilho = scanner.nextDouble();
	
	System.out.print("Factura Cartão: ");
	Double facturaCartao = scanner.nextDouble();
	
	System.out.print("Super Mercado: ");
	Double contaSuperMercado = scanner.nextDouble();
	
	Double gastoTotalfamilia = (contaLuz + contaAgua + contaTelefone + escolaFilho + facturaCartao + contaSuperMercado);
	
	System.out.println("O gasto total da Familia é de R$: " + gastoTotalfamilia );
          scanner.close();
          
	}

}




 