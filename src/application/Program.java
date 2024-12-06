package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter rectangle width and height: ");
		Double width = s.nextDouble();
		Double height = s.nextDouble();
		
		Rectangle r = new Rectangle(width, height);
		
		System.out.printf("AREA = %.2f%n",r.getArea());
		System.out.printf("PERIMETER = %.2f%n",r.getPerimeter());
		System.out.printf("DIAGONAL = %.2f%n",r.getDiagonal());
		
		s.close();
	}

}
