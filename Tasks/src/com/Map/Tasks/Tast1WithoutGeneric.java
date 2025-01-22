package com.Map.Tasks;
import java.util.*;
public class Tast1WithoutGeneric {
	
	public static void main(String[] args) {
		
			Map<Integer,String> m1=new HashMap<Integer, String>();
				m1.put(1, "abc");
				m1.put(2, "pqr");
				m1.put(3, "xyz");
			System.out.println(m1);
			
			Set<Integer> s1=m1.keySet();
			Iterator<Integer> itr=s1.iterator();
			while(itr.hasNext()) {
				Integer Key=itr.next();
				 String val=m1.get(Key);
				 System.out.println(Key+" "+val);
			} 
			
		
	}
}
