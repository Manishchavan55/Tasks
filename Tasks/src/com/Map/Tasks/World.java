package com.Map.Tasks;
import java.util.*;
public class World {
		public static void main(String[] args) {
			List<String> mh=new ArrayList<>();
				mh.add("pune");
				mh.add("Mumbai");
			List<String> mp=new ArrayList<String>();
				mp.add("Bhopal");
				mp.add("Indore");
			Map<String,List<String>> india=new HashMap<String, List<String>>();
				india.put("MH :", mh);
				india.put("MP :", mp);
				
			List<String> state1=new ArrayList<String>();
				state1.add("City_-1");
				state1.add("City_-2");
			List<String> state2=new ArrayList<String>();
				state2.add("City_-1");
				state2.add("City_-2");
			Map<String,List<String>> japan=new HashMap<>();
				japan.put("State-1 :", state1);
				japan.put("State-2 :", state2);
				
			Map<String,Map<String,List<String>>> world =new HashMap<String, Map<String,List<String>>>();
			world.put("INDIA", india);
			world.put("JAPAN", japan);
			//System.out.println(world);
			
			Set<String> key1=world.keySet();
			 
			Iterator<String> itr=key1.iterator();
			
			
			while(itr.hasNext()) {
				 String key=itr.next();
				 
			 Map<String, List<String>> country=world.get(key);
			 
		  Set<String> key2=country.keySet();
		 // System.out.println(key2);
		  Iterator<String> itr2=key2.iterator();
		  while(itr2.hasNext()) {
			 String l1=itr2.next();
			 List<String> al=country.get(l1);
			// System.out.println(al);
			 
			 Iterator<String> city=al.iterator();
			 while(city.hasNext()) {
				 String s=city.next();
				 System.out.println(key+" -> "+ l1+" -> "+  s);
			 }
			 
		  }
		 
			 
			
			
		 
			}
				
			
		}
}
 