package com.demo2;
import java.util.*;
import java.util.stream.Stream;
public class StreamsAreNotReuable {
	
	public static void main(String[] args) {
//		List<String> names=Arrays.asList("ekta","keshav","gunika","rajiv");
//		Stream<String>namesSt=names.stream();
		
		
		Stream<String>namesSt=Stream.of("ekta","keshav","gunika","rajiv");
		
		namesSt.forEach(n-> System.out.println(n));
		
		//namesSt.forEach(n-> System.out.println(n));
		
		//hey i want the stream of ints
		
		Stream<Integer> intStreams=Stream.of(1,3,4,6,7,8);
		intStreams.forEach(no-> System.out.println(no));
		
		
	}

}
