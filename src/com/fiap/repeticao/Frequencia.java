package com.fiap.repeticao;

import java.util.Scanner;

public class Frequencia {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int maxPeople = 2;

		int rm;
		int classAttendance;

		double sumNotes = 0;
		
		int approvedPupils = 0;
		int reprovedPupils = 0;
		int reprovedPupilsByLowClassAttendance = 0;
		
		for(int i = 0; i < maxPeople; i++) {
		    System.out.print("\nDigite o RM: ");
		    rm = read.nextInt();
		    
		    System.out.print("Digite a frequencia nas aulas: ");
		    classAttendance = read.nextInt();
		    
		    sumNotes = 0;
		    
		    System.out.print("\nDigite a nota 1: ");
		    sumNotes = sumNotes + read.nextDouble();
		    
		    System.out.print("Digite a nota 2: ");
		    sumNotes = sumNotes + read.nextDouble();
		    
		    System.out.print("Digite a nota 3: ");
		    sumNotes = sumNotes + read.nextDouble();
		    
		    double averageNotes = sumNotes / 3;
		    
		    String finalResult;
		    
		    if (classAttendance < 40)
		    	reprovedPupilsByLowClassAttendance++;
		    
		    if (averageNotes >= 6 && classAttendance >= 40) {
		    	approvedPupils++;
		    	finalResult = "Aprovado!";
		    } else {
		    	reprovedPupils++;
		    	finalResult = "Reprovado!";
		    }

		    String print =
	    		"\nO rm " + rm + " tirou a nota final " + averageNotes + " e foi " + finalResult + "\n";
		    
		    System.out.printf(print);
		    System.out.printf("<------------------------------ // ------------------------------> \n");
		}
		
		System.out.printf("\nTotal de alunos aprovados: %d: \n", approvedPupils);
		System.out.printf("\nTotal de alunos reprovados: %d: \n", reprovedPupils);
		System.out.printf("\nTotal de alunos reprovados por baixa frequencia: %d: \n", reprovedPupilsByLowClassAttendance);
	}

}
