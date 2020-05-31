
import java.util.Scanner;

public class PrimeiroExemplo {

	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);

	    int quantityFamilies;
	    System.out.print("Digite quantidade de famílias: ");
	    quantityFamilies = read.nextInt();
	    
	    double minimumWage;
	    System.out.print("Digite o valor do salário mínimo R$: ");
	    minimumWage = read.nextInt();
	    
	    double valueFoodStamps = minimumWage / 10;
	    
	    int threeMounthFoodStamps = quantityFamilies * 3;
	    double valueThreeMounthsFoodStamps = threeMounthFoodStamps * valueFoodStamps;
	    
	    int sixMounthFoodStamps = quantityFamilies * 6;
	    double valueSixMounthsFoodStamps = sixMounthFoodStamps * valueFoodStamps;
	    
	    System.out.printf("\nO valor da cesta básica é: R$ %.2f \n", valueFoodStamps);

	    System.out.printf("\nQuantidade de cestas básicas para 3 meses: %d \n", threeMounthFoodStamps);
	    System.out.printf("Valor das cestas básicas para 3 meses é R$: %.2f \n", valueThreeMounthsFoodStamps);

	    System.out.printf("\nQuantidade de cestas básicas para 6 meses: %d \n", sixMounthFoodStamps);
	    System.out.printf("Valor das cestas básicas para 6 meses é R$: %.2f \n", valueSixMounthsFoodStamps);
	}

}