package Capitulo_10_EscritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio_1 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		for(int i = 0; i < 4; i++) {
			System.out.print("Informe as tarefas: ");
			String nome = scanner.nextLine();
			
			linhas.add(nome);
		}
		Path arquivo = Paths.get("C:/Users/Jeremias/Downloads/tarefas.txt");
		Files.write(arquivo, linhas);
		System.out.println("Fim...");
		
		scanner.close();
	}

}
