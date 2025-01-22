package com.Comparable.Tasks;
import java.util.*;
public class Task1 {
		
		public static void main(String[] args) {
				Customer c1=new Customer(2, "saurabh", 123424);
				Customer c2=new Customer(3, "vishal", 646262);
				Customer c3=new Customer(4, "mukesh", 452252);
				Customer c4=new Customer(1, "ram", 2646246);
				
				Set<Customer> st=new TreeSet<Customer>();
					st.add(c1);
					st.add(c2);
					st.add(c3);
					st.add(c4);
					
				Iterator<Customer> itr=st.iterator();
				while(itr.hasNext()) {
					Customer cst=itr.next();
					System.out.println(cst.cid);
					System.out.println(cst.name);
					System.out.println(cst.phone);
				}
					
				
		}

		 
}
