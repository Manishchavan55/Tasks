package LogicalPrograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		//Even and odd number is like the number who is  devided with 2 and give the 0 remender else the number is odd...
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number that want to check is it Even or Odd...");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("The number is Even..!");
		}
		else {
			System.out.println("The number is Odd...!");
		}
		
	}
}
