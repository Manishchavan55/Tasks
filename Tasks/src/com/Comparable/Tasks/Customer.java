package com.Comparable.Tasks;

public class Customer implements Comparable<Customer>{
	
	int cid;
	String name;
	long phone;
	
	public Customer(int cid, String name, long phone) {
		super();
		this.cid = cid;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		//return this.cid-o.cid; //Sort By Id
		//return this.name.compareTo(o.name); //Sort by name...
		return (int) (this.phone-o.phone);
	}
	
	
}
