package com.Map.Tasks;
import java.util.*;
public class Task2India {
	public static void main(String[] args) {
		Set<String> st1=new HashSet<String>();
			st1.add("Pune");
			st1.add("Mumbai");
		Set<String> st2=new HashSet<String>();
			st2.add("Indore");
			st2.add("Bhopal");
		
		Map<String,Set<String>> india=new HashMap<String, Set<String>>();
			india.put("MH", st1);
			india.put("MP", st2);
			
		System.out.println(india);
			Set<String> s1=india.keySet();
			Iterator<String> itr=s1.iterator();
			while(itr.hasNext()) {
				String key=itr.next();
				Set<String> set=india.get(key);
				//System.out.println(set);
				Iterator<String> itr2=set.iterator();
				while(itr2.hasNext()) {
					String str=itr2.next();
					System.out.println(key+" -> "+str);
				}
				
			}
	} 
}
 