package com.Multithreading;

public class Task1 extends Thread{
	 int st; 
	 int end;
	 

	public Task1(int st, int end) {
		super();
		this.st = st;
		this.end = end;
	}

	public void run() {
		for(int i=st; i<end; i++) {
			System.out.println(i+" "+currentThread().getName());
			i++;
		}
	}
	public static void main(String[] args) {
		
		Task1 odd=new Task1(1,100);
		odd.setName(": Odd Number's ");
			odd.start();
		Task1 even=new Task1(2,100);
		even.setName(": Even Number's ");
			even.start();
			
		
		
	}
}
