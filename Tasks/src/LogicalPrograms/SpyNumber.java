package LogicalPrograms;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		//The spy number is a number that each digit number addition and multiplication is same...!
		int sum=0;
		int mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		while(num>0) {
			 sum=sum+num%10;
			mul*=num%10;
			num=num/10;
		}
		
		if(sum==mul) {
			System.out.println("The number is SPY.....!");
		}
		else {
			System.out.println("The number is not SPY...!");
		}
	}
}
