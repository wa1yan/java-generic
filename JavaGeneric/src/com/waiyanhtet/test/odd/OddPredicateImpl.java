package com.waiyanhtet.test.odd;

import com.waiyanhtet.test.main.Predicate;

/** 
 * @author waiyanhtet
 * @version 1.0
 */
public class OddPredicateImpl implements Predicate<Integer> {

	@Override
	public boolean predicate(Integer a) {
		return a % 2 != 0;
	}

}

