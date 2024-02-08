package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB,  xC, yA, yB, yC;
		System.out.println("Enter the measures of triangle x:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC)/2.0;
		 double areax = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		
		  p = (yA + yB + yC)/2.0;
		double areay = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		
		System.out.printf("Triangle x area : %.4f%n", areax);
		System.out.printf("Triangle y area : %.4f%n", areay);
		
		if(areax > areay) {
			System.out.println("Larger area : X");
		}
		else {
			System.out.println("Larger area : Y");
		}
		sc.close();
		

	}

}