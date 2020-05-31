package com.fiap.repeticao;

import java.util.Scanner;

public class Votos {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int candidate01 = 0;
		int candidate02 = 0;
		int candidate03 = 0;
		int candidate04 = 0;
		
		int voteNull = 0;
		int voteWhite = 0;

		int number = -1;
		
		while (number != 0) {
		    System.out.print("\nDigite o voto: ");
		    number = read.nextInt();
			
			if (number == 0)
				break;
			
			switch(number) {
				case 1:
					candidate01++;
					break;
				case 2:
					candidate02++;
					break;
				case 3:
					candidate03++;
					break;
				case 4:
					candidate04++;
					break;
				case 5:
					voteNull++;
					break;
				case 6:
					voteWhite++;
					break;
			}
		}
		
		int totalVotes =
				candidate01 + candidate02 + candidate03 +
				candidate04 + voteWhite + voteNull;
		
		double averageVotesNull = (voteNull * 100.0) / totalVotes;
		double averageVotesWhite = (voteWhite * 100.0) / totalVotes;
				
		System.out.printf("\nPorcentagem de votos nulus (%%): %.2f", averageVotesNull);
		System.out.printf("\nPorcentagem de votos brancos (%%): %.2f", averageVotesWhite);
	}

}
