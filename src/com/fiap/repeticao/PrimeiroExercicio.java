package com.fiap.repeticao;
import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);

	    int maxPeople = 4;
	    
		int peopleOlderThan50 = 0;
		
		double heightPeople = 0;
		int countHeightPeople = 0;

		double weightLess40 = 0;
		
	    int age = 0;
	    double height = 0;
	    double weight = 0;
		
		for(int i = 0; i < maxPeople; i++) {
		    System.out.print("\nDigite a idade: ");
		    age = read.nextInt();
		    
		    System.out.print("Digite a altura: ");
		    height = read.nextDouble();
		    
		    System.out.print("Digite o peso: ");
		    weight = read.nextDouble();
		    
		    if (age > 50) {
		    	peopleOlderThan50++;
		    }
		    
		    if (age > 10 && age < 20) {
		    	heightPeople = heightPeople + height;
		    	countHeightPeople++;
		    }
	    
		    if (weight < 40) {
		    	weightLess40++;
		    }    
		}
//	
		double averageHeight = heightPeople / countHeightPeople;
		double averageWeightLess40 = (weightLess40 * 100.0) / maxPeople;
		
	    System.out.printf("\nQuantidade de pessoas maiores que 50 anos: %d \n", peopleOlderThan50);
	    System.out.printf("\nMédia das alturas de pessoas entre 10 e 20 anos (m): %.2f \n", averageHeight);
		System.out.printf("\nPorcentagem de pessoas pesando menos que 40 kg (%): %.2f \n", averageWeightLess40);
	}

}
