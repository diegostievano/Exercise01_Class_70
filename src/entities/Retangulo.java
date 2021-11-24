package entities;

import java.util.Locale;

public class Retangulo {
	public double width;
	public double height;
	
	private double area() {		
		return width * height;		
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	private double diagonal () {		
		double hipotenusa = 0;
		
		hipotenusa = Math.pow(width, 2) + Math.pow(height, 2);
		
		return Math.sqrt(hipotenusa);
	}
	
	private void ImprimeTriangulo() {
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("AREA = %.2f%n", area());
		System.out.printf("PERIMETER = %.2f%n", perimeter());
		System.out.printf("DIAGONAL = %.2f%n", area());
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f%n", area()) + 
				"PERIMETER = " + String.format("%.2f%n", perimeter()) +
				"DIAGONAL = " + String.format("%.2f%n", diagonal());
	}

}
