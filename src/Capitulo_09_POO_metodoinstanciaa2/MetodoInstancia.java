package Capitulo_09_POO_metodoinstanciaa2;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Alenxandre";
		cliente.ultimoNome = "Afonso";
		cliente.telefone = "34 90000-0000";
		cliente.email = "alaexandre@afonsoalgaworks.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "João";
		cliente2.ultimoNome = "Silva";
		cliente2.telefone = "34 89000-0000";
		cliente2.email = "joaosilva@gmail.com";
	
			//System.out.println("Nome cliente: " + Cliente.obterNomeCompleto(cliente)); //Esse é o metodo estaticp.
		System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
	}
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		
//		return nomeCompleto;
//	}

}
