package LogicalPrograms;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		//The spy number is a number that each digit number addition and multiplication is same...!
		int sum
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		while(num>0) {
			 sum=sum+num%10;
		}
	}
}
