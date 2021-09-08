package org.sixAutomation.SDETTraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class JavaCollections {
	//@Test
	public void understandingList() {
		List<String> names = new ArrayList<String>();
		names.add("Selenium");
		names.add("Appium");
		names.add("Java");
		names.add("Selenium");
		
		System.out.println("LIST names === " + names);
		
		 Iterator itr=names.iterator();
		 while(itr.hasNext()){  
			   System.out.println(itr.next());  
		 }
		
		
		List numbers = new ArrayList<>();
		numbers.add(501);
		numbers.add(506);
		numbers.add(508);
		numbers.add(503);
		numbers.add(502);
		numbers.add(509);
		numbers.add(501);
		numbers.add("Selenium");
		numbers.add("Appium");
		numbers.add("Java");
		numbers.add("Selenium");
		
		//System.out.println("LIST numbers === " + numbers);
	}
	
	//@Test
	public void understandingSet() {
		Set<String> names = new HashSet<String>();
		names.add("Selenium");
		names.add("Appium");
		names.add("Java");
		names.add("Selenium");
		
		System.out.println("SET names === " + names);
		 Iterator itr=names.iterator();
		 while(itr.hasNext()){  
			   System.out.println(itr.next());  
		 }
		
		
		Set numbers = new HashSet<>();
		numbers.add(501);
		numbers.add(506);
		numbers.add(508);
		numbers.add(503);
		numbers.add(502);
		numbers.add(509);
		numbers.add(501);
		numbers.add("Selenium");
		numbers.add("Appium");
		numbers.add("Java");
		numbers.add("Selenium");
		
		//System.out.println("LIST numbers === " + numbers);

	}
	
	@Test
	public void understandingMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Selenium");
		map.put(2, "Appium");
		map.put(3, "Java");
		map.put(4, "Java");
		
		System.out.println("map === " + map);
	}

}
