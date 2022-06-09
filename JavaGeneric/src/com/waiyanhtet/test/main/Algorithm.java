package com.waiyanhtet.test.main;

import java.util.Collection;

/** 
 * @author waiyanhtet
 * @version 1.0
 */
public final class Algorithm {

	public static<T> int count(Collection<T> list, Predicate<T> p){
		
		int count = 0;
		
		for(T element : list) {
			if(p.predicate(element)) {
				++count;
			}
		}
		
		return count;
	}
	
	public static<T extends Comparable<T>> T Max(T obj1, T obj2) {
		return obj1.compareTo(obj2) > 0 ? obj1 : obj2;
	}
	
	public static<T> T Max(T obj1, T obj2) {
		return obj1.equals(obj2) ? obj1 : obj2;
	}
}
