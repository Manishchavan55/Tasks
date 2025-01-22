package com.Map.Tasks;
import java.util.*;

public class Task1WithGeneric {
	public static void main(String[] args) {
		Map<String,String> mp=new HashMap<>();
			mp.put("a", "abc");
			mp.put("b", "pqr");
			mp.put("c", "xyz");
//			_____*******Iteration By Using Iterator******_______
//			Set<String> keys=mp.keySet();
//			System.out.println(keys);
//      		Iterator<String> itr=keys.iterator();
//		System.out.println(itr);
//		while(itr.hasNext()) {
//			String key=itr.next();
//			System.out.println(key);
//	  			String s=mp.get(key);
//	  			System.out.println(s);
//			 
//		}
			
			mp.forEach((k,v)->{
				System.out.println(k);
				System.out.println(v);
				
			});
			
			
	}
}
