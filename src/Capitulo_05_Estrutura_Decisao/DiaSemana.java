package Capitulo_05_Estrutura_Decisao;
import java.util.Scanner;
public class DiaSemana {

	public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        System.out.print("Digite o Dia da Semana: ");
        Integer diaSemana = scanner.nextInt();
        
        String dia;
        
       switch (diaSemana) {
		    case 1: dia = "Domingo";
		      break;
		    case 2: dia = "Segunda-Feira";
		      break;
		    case 3: dia = "Terça-Feira";
		      break;
		    case 4: dia = "Quarta-Feira";
		      break;
		    case 5: dia = "Quinta-Feira";
		      break;
		    case 6: dia = "Sexta-Feira";
		      break;
		    case 7: dia = "Sabado";
		      break;
		    default: dia = "Inavlido";
             }
		    
       			System.out.println(" O dia escolhido foi: "  + dia);
       			scanner.close();
			    
		
	   }

}

