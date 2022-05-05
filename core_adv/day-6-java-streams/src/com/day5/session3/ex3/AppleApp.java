package com.day5.session3.ex3;
import java.util.*;
import java.util.function.Predicate;

public class AppleApp {
	public static List<Apple> getAllApplesOnPredicate(List<Apple> apples, 
			Predicate<Apple> predicate){
		List<Apple> apples2=new ArrayList<Apple>();
		for(Apple temp: apples) {
			if(predicate.test(temp)) {
				apples2.add(temp);
			}
		}
		return apples2;
	}
}
