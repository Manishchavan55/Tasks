package LogicalPrograms;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		//The number that square last digit and square number it will same;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int square=num*num;
		
		int lastDigit=square%10;
		if(num==lastDigit) {
			System.out.println("The "+num+" is Automorphic...! Because the square is "+square+" and the last Digit of it "+lastDigit);
		}
		else {
			System.out.println("The number is not Automorphic..!");
		}
		
	}
}
