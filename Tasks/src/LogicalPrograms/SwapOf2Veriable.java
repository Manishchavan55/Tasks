package LogicalPrograms;

import java.util.Scanner;

public interface SwapOf2Veriable {

	public static void main(String[] args) {
		// The swapping of 2 variable is like a one variable value is to shift into another variable like a=b and b=a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fist number and second...!");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Before swapping A ="+a+" B ="+b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping A ="+a+" B ="+b);
		
		
		
	}
}
