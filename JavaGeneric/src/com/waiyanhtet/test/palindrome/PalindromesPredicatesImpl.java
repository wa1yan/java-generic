package com.waiyanhtet.test.palindrome;

import com.waiyanhtet.test.main.Predicate;

/** 
 * @author waiyanhtet
 * @version 1.0
 */
public class PalindromesPredicatesImpl<T> implements Predicate<T>{

	@Override
	public boolean predicate(T t) {
		String str =  t.toString();
		String result = new StringBuilder(str).reverse().toString();

		if(str.equals(result)) {
			return true;
		}
		return false;
	}

}

