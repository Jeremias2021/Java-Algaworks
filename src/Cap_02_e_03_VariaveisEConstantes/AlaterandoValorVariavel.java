package Cap_02_e_03_VariaveisEConstantes;
import java.util.Scanner;
public class AlaterandoValorVariavel {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Valor do Produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo de pagamento [1 = a vista / 2 = a prazo]: ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		if(pagamentoAVista) {   // pode ser assim com exclamação antes do variavel if(!pagemantoAv=Vista)
		
		} else {
			juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros / 100;
		Double valorTotal = acrescimo + valorProduto;
		System.out.println("Valor tota: " + valorTotal);
		
		scanner.close();	
	}
	


}
