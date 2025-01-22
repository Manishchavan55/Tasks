package com.Multithreading;

public class Task2 extends Thread{
	int st; 
	int end;
	public Task2(int st, int end) {
		super();
		this.st = st;
		this.end = end;
	}
	public void run() {
		for(int i=st; i<end; i++) {
			System.out.println(i+" " +currentThread().getName());
			i++;
		}
	}
	public static void main(String[] args) {
		Task2 t1=new Task2(1, 100);
			t1.setName("Odd");
			t1.start();
		Task2 t2=new Task2(2, 100);
			t2.setName("Even");
			t2.start();
	}
}
