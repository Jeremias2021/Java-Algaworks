package Capitulo_10_EscritaArquivos;

import  java.io.IOException ;
import  java.nio.file.Files ;
import  java.nio.file.Path ;
import  java.nio.file.Paths ;
import  java.util.ArrayList ;
import  java.util.Scanner ;

public class Exercicio_1_OutraForma {
	
	public  static  void  main ( String [] args ) throws  IOException {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String>linhas =  new  ArrayList<String>();
		
		String tarefa;
		int i = 0;
		while ( true ) { // Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
			System.out.print( "Tarefa "  + i +  " : " );
			tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break; // Essa é uma maneira única de parar esse laço.
			}

			linhas . add(tarefa);
			i ++ ;
		}

		escreverNoArquivo ("C:/Users/Jeremias/Downloads/tarefas.txt" , linhas);

		scanner.close();
		
		System.out.println(" Fim ... ");
	}
	
	static  void  escreverNoArquivo ( String  arquivo , ArrayList < String >  linhas ) throws  IOException {
		Path tarefas = Paths.get(arquivo);
		Files.write(tarefas, linhas);
	}

}

