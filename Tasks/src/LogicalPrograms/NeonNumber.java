package LogicalPrograms;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		//The neon number is a one number square digit addition is same a number for ex : 9 square is 81 and addition of 8+1 is 9 it meanse the number is neon number...!
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number that check if it is neon or not...!");
		int num=sc.nextInt();
		int square=num*num,sum=0;
		 while(square>0) {
			int last= square%10;
			sum+=last;
			square/=10;
		 }
		 if(sum==num) {
			 System.out.println("Number is neon  ...!");
		 }
		 else {
			 System.out.println("Number is not Neon...!");
		 }
		
	}
}
