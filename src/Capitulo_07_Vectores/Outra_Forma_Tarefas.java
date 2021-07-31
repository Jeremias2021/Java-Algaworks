package Capitulo_07_Vectores;

import java.util.Scanner;

public class Outra_Forma_Tarefas {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			String[] tarefas = new String[5];
			
			for(int i = 0; i < tarefas.length; i ++ ) {
				System.out.print(" Tarefa "  + i +  " : ");
				tarefas [i] = scanner.nextLine ();
			}
			
			
			System.out.println(" Suas tarefas são: " );
			for (int i = 0; i < tarefas.length; i++ ) {
				System.out.println(i +  " : "  + tarefas [i]);
			}
			
			scanner.close();

	}

}
