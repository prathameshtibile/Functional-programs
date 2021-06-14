/**
 * @author PRATHAMESH TIBILE
 * @since 11-6-21
 * to find the value of distance
 */

package Functional_Program;

import java.util.Scanner;

public class Distance {
   // x value of x axix
   // y value of y axix
	
	static void calculate(int x, int y)
	{
		System.out.println("Distance is" + Math.pow((x *x + y * y),0.5));
	}
	public static void main(String[] args)
	{
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter value of x:");
				int x = sc.nextInt();
				System.out.println("Enter value of y:");
				int y = sc.nextInt();
				calculate(x , y);		
				}
			catch (Exception e) 
			{
				System.out.println("enter integer only");
			}
			
	}	
	
}
