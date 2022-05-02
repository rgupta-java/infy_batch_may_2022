package com.day4.session3.set_ex;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Value {
	private int val;

	public Value(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	//how it is actually working...explore it
	@Override
	public int hashCode() {
		return Objects.hash(val);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		return val == other.val;
	}
	
	
}

public class WhyHashCodeIsImpToOverriden {

	public static void main(String[] args) {
		Set<Value> myset = new HashSet<Value>();// hashset internally used hashing

		// i have added a value of 33
		myset.add(new Value(33));
		boolean status = myset.contains(new Value(33));
		System.out.println(status);
	}

}
