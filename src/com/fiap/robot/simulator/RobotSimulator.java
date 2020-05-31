package com.fiap.robot.simulator;

import java.util.Scanner;

public class RobotSimulator {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		// Carga mínima da bateria
		int MINIMUM_BATTERY_CHARGE = 33;

		// Variáveis para o usuário inserir distância e direção
		String direction;
		int distance;

		// Váriavéis para auxiliar na localização do robo no mapa 
		int restHorizontal = 0;
		int restVertical = 0;
		
		System.out.print("<--- Bem-Vindo ao TRX Simulator     --->\n");

		System.out.print("\n     Siga as instruções:");
		System.out.print("\n     A carga da bateria deve ser superior ou igual a " + MINIMUM_BATTERY_CHARGE + ".");
		System.out.print("\n     O robo TRX inicia no mapa em (0, 2).\n");

		System.out.print("\n<--- Programa carregado com sucesso --->\n");
		
		System.out.print("\n     Digite a carga da bateria: ");
	    int batteryCharge = read.nextInt();
		
	    // Fail Fast - Encerra o programa caso a carga da bateria não cumpra o requisito mínimo.
	    if (batteryCharge < MINIMUM_BATTERY_CHARGE) {
	    	System.out.print
	    		("\n     A carga da bateria deve ser superior ou igual a " + MINIMUM_BATTERY_CHARGE);
	    	System.out.print("\n\n<--- Simulador Finalizado --->\n");
	    	return;
	    }
	    
		for(int command = 1; command <= 5; command++) {
		    System.out.print("\n     Digite a direção: ");
		    direction = read.next();
		    
		    System.out.print("     Digite a distância: ");
		    distance = read.nextInt();
			
		    // Verificação do comando 1
		    if (command == 1) {
		    	if (direction.equals("FRENTE") && (distance >= 3 && distance <= 5)) {
		    		restHorizontal = 5 - distance;
		    		
		    		// Se a condição for atendida pula para a próxima iteração do laço de repetição 
		    		continue;	
		    	}
		    }

		    // Verificação do comando 2
		    if (command == 2) {
		    	if (direction.equals("ESQUERDA") && (distance >= 7 && distance <= 9)) {
		    		restVertical = 9 - distance;		    		
		    		continue;
		    	}
		    }
		    
		    // Verificação do comando 3
		    if (command == 3) {
		    	int maxDistance = restHorizontal + 4;
		    	int minDistance = maxDistance - 2;
		    	if (direction.equals("FRENTE") && (distance >= minDistance && distance <= maxDistance)) {
		    		restHorizontal = maxDistance - distance;
		    		continue;
		    	}
		    }
		    
		    // Verificação do comando 4
		    if (command == 4) {
		    	int maxDistance = 9 - restVertical;
		    	int minDistance = maxDistance - 2;
		    	if (direction.equals("DIREITA") && (distance >= minDistance && distance <= maxDistance)) {
		    		restVertical = maxDistance - distance;
		    		continue;
		    	}
		    }
		    
		    // Verificação do comando  5
		    if (command == 5) {
		    	int maxDistance = restHorizontal + 7;
		    	if (direction.equals("FRENTE") && (distance == maxDistance && restVertical == 1)) {
		    		System.out.print("\n\n<--- Parabéns!! Você chegou ao prêmio! --->\n");	    		
		    		continue;
		    	}
		    }

		    // Se nenhuma condição for atendida o laço de repetição é encerrado
		    System.out.print("\n<--- Comando errado. O simulador foi finalizado --->\n");
		    break;
		}
	    	

	}

}
