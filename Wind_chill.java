package Functional_Program;

import java.util.Scanner;

public class Wind_chill {
	static void windchill(double t, double v)  
	{
		double w = 35.74 + 0.62158 * t * Math.abs(0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println(w);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in farenheit: ");
		double t = sc.nextInt();
		System.out.println("Enter Wind speed in miles per hour: ");
		double v = sc.nextInt();
			if (Math.abs(t) > 50 || v > 120 || v < 3)
			{
				System.out.println("Enter corect input: ");
			}
			else
			{
				windchill(t,v);
	        }
	
	}
}
