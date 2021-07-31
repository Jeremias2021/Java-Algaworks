package Capitulo_10_LeituraArquivos;

import  java.io.IOException ;
import  java.nio.file.Files ;
import  java.nio.file.Path ;
import  java.nio.file.Paths ;
import  java.util.List ;

public  class  Exercicio2 {

	public  static  void  main ( String [] args ) throws  IOException {
		List< String> linhas = readAlllines("C:/Users/Jeremias/Downloads/arquivo.txt");
		
		System.out.println(" SUA LISTA DE TAREFAS DO DIA ");
		
		for(int i = 0; i < linhas.size(); i ++ ) {
			String tarefa = linhas.get(i);
			
			System.out.println(i +  " : "  + tarefa);
		}
		
		System.out.println( " ---------- " );
	}
	
	static  List<String> readAlllines( String arquivo ) throws  IOException {
		Path caminho =  Paths.get(arquivo);
		return Files.readAllLines(caminho);
	}
}


