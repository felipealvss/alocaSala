package alocaSala;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Sala salaDeAlocacao;
		
		System.out.println();
		System.out.print("Quantidade de salas: ");
		int numSalas = read.nextInt();
		
		int[] seqSalas = new int[numSalas];

		System.out.println();
		System.out.println("Há " + numSalas + " salas disponíveis! Qual deseja alocar? ");
		int salaAloc = read.nextInt();
		
		System.out.println();
		if (seqSalas[salaAloc] != 0) {
			System.out.println("Sala ocupada!");
		} else {
			salaDeAlocacao = new Sala(salaAloc);
			System.out.println("Sala " + salaAloc + " alocada com sucesso!");
		}
		
		read.close();
	}

}
