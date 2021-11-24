package application;
import java.util.Scanner;
import entities.Retangulo;

public class Main {
	
	/*Fazer um programa para ler os valores da largura e altura 
	de um retângulo. Em seguida, mostrar na tela o valor de 
	sua área, perímetro e diagonal. Usar uma classe como 
	mostrado no projeto ao lado.*/

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Retangulo rect = new Retangulo();
		
		System.out.println("Enter rectangle width and height");
		
		rect.width = input.nextDouble();
		rect.height = input.nextDouble();		
		
		System.out.println(rect);
		
		input.close();

	}

}
