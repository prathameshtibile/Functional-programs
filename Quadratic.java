package Functional_Program;

import java.util.Scanner;

public class Quadratic {
	static void roots (int a, int b, int c)
	{
			int delta = Math.abs(b * b - 4 * a * c);
			double sqrt1 = Math.abs(-b + Math.sqrt(delta))/(2*a);
			double sqrt2 =  Math.abs(-b - Math.sqrt(delta))/(2*a);
			System.out.println("The positive root of the equation is  "+sqrt1);
			System.out.println("The negative root of the equation is  " +sqrt2);	
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		System.out.println("Enter c :");
		int c = sc.nextInt();
		
		roots(a,b,c);
		
//		Quadratic f = new Quadratic();
//		f.roots(a, b, c);
//		
//		Quadratic.roots(a, b, c);
		
	}
	

}

