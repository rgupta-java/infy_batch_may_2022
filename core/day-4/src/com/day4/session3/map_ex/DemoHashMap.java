package com.day4.session3.map_ex;
import java.util.*;
import java.util.Map.Entry;
public class DemoHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<String, Integer>();
		//store marks of 5 students 
		map.put("ravi", 78);
		map.put("kapil", 98);
		map.put("sunil", 90);
		map.put("ekta", 89);
		
		//how to print 
		System.out.println(map);
		
		//what happen if i want to print it one by one
		
		//map have a concept of entrySet and keyset*: entrySet it is better in performace
		
//		Set<String> keySet = map.keySet();
//		for(String key: keySet) {
//			System.out.println(key +": "+ map.get(key));
//		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet(); //entry=key + value
		
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +": "+ entry.getValue());
		}
		
		//how hashmap works?
		
	}
}
