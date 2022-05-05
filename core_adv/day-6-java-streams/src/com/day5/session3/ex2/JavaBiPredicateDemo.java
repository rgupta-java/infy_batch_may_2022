package com.day5.session3.ex2;

import java.util.function.BiPredicate;

class MyCal{
	public static boolean isGreater(int x, int y) {
		return  x>y?true:false;
	}
}
public class JavaBiPredicateDemo {

	public static void main(String[] args) {
		//s1 and s2 
		BiPredicate<Integer, Integer> biPredicate=(x, y)-> x>y?true:false;
		BiPredicate<Integer, Integer> biPredicate2=MyCal::isGreater;
			
		System.out.println(biPredicate.test(12, 10));
	}
}
