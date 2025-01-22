package com.Comparable.Tasks;

import java.util.*;

class Person {

	private String pname;
	private String paddr;
	private long mobno;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddr() {
		return paddr;
	}

	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
 

}

class Account {
	private int accono;

	private String acctype;
	private Person p;

	public int getAccono() {
		return accono;
	}

	public void setAccono(int accono) {
		this.accono = accono;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	 

}

class Bank implements Comparable<Bank> {

	private String bname;
	private String branch;
	private String addr;
	private Account acc;

	 

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	@Override
	public int compareTo(Bank o) {
		 //return this.getAcc().getP().getPname().compareTo(o.getAcc().getP().getPname());
		return (int) (this.getAcc().getP().getMobno()-o.getAcc().getP().getMobno());
		
	}
}

public class Test {

	public Set<Bank> setDetails() {
		Set<Bank> bank = new TreeSet<Bank>();
		Person p = new Person();
		Account a = new Account();
		Bank b = new Bank();
		p.setPname("Saurabh");
		p.setPaddr("Karvenagar");
		p.setMobno(1242335343);

		a.setAccono(1342312);
		a.setAcctype("Saving");
		a.setP(p);

		b.setBname("SBI");
		b.setBranch("akurdi");
		b.setAddr("Karvenagar");
		b.setAcc(a);

		Person p1 = new Person();
		Account a1 = new Account();
		Bank b1 = new Bank();
		p1.setPname("Kedar");
		p1.setPaddr("Warje");
		p1.setMobno(876543245);

		a1.setAccono(45675456);
		a1.setAcctype("Current");
		a1.setP(p1);

		b1.setBname("BOI");
		b1.setBranch("Kothrud");
		b1.setAddr("Pune");
		b1.setAcc(a1);

		bank.add(b);
		bank.add(b1);
		return bank;
	}

	public void getDetails(Set<Bank> bank) {

		for (Bank b : bank) {
			System.out.println("Name is :"+b.getAcc().getP().getPname());
			System.out.println("Address id :"+b.getAcc().getP().getPaddr());
			System.out.println("Mobile No :"+b.getAcc().getP().getMobno());
			System.out.println("Account no :"+b.getAcc().getAccono());
			System.out.println("Account type :"+b.getAcc().getAcctype());
			System.out.println("Branch Name :"+b.getBname());
			System.out.println("Branch :"+b.getBranch());
			System.out.println("Branch address :"+b.getAddr());
			
			System.out.println("*********_______***********");
		}
	}

	public static void main(String[] args) {

		Test t = new Test();
		Set<Bank> obj = t.setDetails();
		t.getDetails(obj);

	}
}
