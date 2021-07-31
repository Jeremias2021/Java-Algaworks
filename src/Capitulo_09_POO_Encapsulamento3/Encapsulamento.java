package Capitulo_09_POO_Encapsulamento3;

public class Encapsulamento {

	public static void main(String[] args) {
//		Cliente cliente = novo Cliente ();
//		
// 		cliente.nome = "Alexandre Afonso";
// 		cliente.telefone = "34922334455";
//		
// 		System.out.println ("Nome cliente:" + cliente.nome);
		
		
		Cliente cliente =  new Cliente ();
		
		cliente . setNome(" Alexandre Afonso ");
		cliente . setTelefone(" 34922334455 ");
		
		System.out.println( " Nome cliente: "  + cliente . getNome ());
		System.out.println( " Primeiro nome: "  + cliente . getPrimeiroNome ());
		System.out.println( " Último nome: "  + cliente . getUltimoNome ());
		
		

	}
}
