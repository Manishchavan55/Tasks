package LogicalPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		//Factorial is number that is sum of multiplied decreasing order number.
		//Ex: 5 factorial is 120 ( 5 * 4 * 3 * 2 * 1 )
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number that factorial you want to find ....!");
		int num=sc.nextInt();
		
		int fact=1;
		for(int i=1; i<=num; i++)
		{
			fact*=i;
		}
		System.out.println("The factorial of "+num+ " is "+ fact);
		
		
		
	}
}
