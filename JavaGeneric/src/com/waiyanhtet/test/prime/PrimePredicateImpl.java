package com.waiyanhtet.test.prime;

import java.util.stream.IntStream;

import com.waiyanhtet.test.main.Predicate;

/** 
 * @author waiyanhtet
 * @version 1.0
 */
public class PrimePredicateImpl implements Predicate<Integer> {

	@Override
	public boolean predicate(Integer number) {
		boolean flag = number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
				.noneMatch(n -> (number % n == 0));
		return flag;
	}

}

