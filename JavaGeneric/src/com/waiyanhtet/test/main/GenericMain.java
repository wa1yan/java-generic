package com.waiyanhtet.test.main;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.waiyanhtet.test.odd.OddPredicateImpl;
import com.waiyanhtet.test.palindrome.PalindromesPredicatesImpl;
import com.waiyanhtet.test.prime.PrimePredicateImpl;

/**
 * @author waiyanhtet
 * @version 1.0
 */
public class GenericMain {

	public static void main(String[] args) {

		Collection<Integer> intCollection = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37);
		Collection<Double> doubleCollection = Arrays.asList(1.0, 2.2, 1.3, 1.4, 5.5, 7.2, 22.2, 53.11, 343.343);
		Collection<String> strCollection = Arrays.asList("a", "b", "aba", "cd", "dcd", "efe");

		// Odd number
		int oddCount = Algorithm.count(intCollection, new OddPredicateImpl());
		System.out.println(intCollection + ", Odd Count : " + oddCount);

		// Prime number
		int primeCount = Algorithm.count(intCollection, new PrimePredicateImpl());
		System.out.println(intCollection + ", Prime Count : " + primeCount);

		// StringPalindromes
		int strCount = Algorithm.count(strCollection, new PalindromesPredicatesImpl<String>());
		System.out.println(strCollection + ", Palidrome Count : " + strCount);

		// IntegerPalindromes
		int intCount = Algorithm.count(doubleCollection, new PalindromesPredicatesImpl<Double>());
		System.out.println(doubleCollection + ", Palidrome Count : " + intCount);

		// swap
		String[] strArr = { "a", "b", "c", "d" };
		System.out.print("Before swap : ");
		printArray(strArr);

		swap(strArr, 2, 3);

		System.out.print("After swap : ");
		printArray(strArr);

		// swap
		Integer[] intArr = { 1, 2, 3, 4, 5 };
		System.out.print("Before swap : ");
		printArray(intArr);

		swap(intArr, 2, 3);

		System.out.print("After swap : ");
		printArray(intArr);

		//Max
		List<Double> list1 = Arrays.asList(0.11,0.2,0.3,0.34, 0.5);
		double maxInt = findMax(list1, 0, 3);
		System.out.println("Maximum value : " + maxInt);

		List<String> list2 = Arrays.asList("fad","fac","fab","dc","ec");
		String maxString = findMax(list2, 0, 3);
		System.out.println("Maximum value : " + maxString);

	}

	public static <T> void swap(T[] arr, int index1, int index2) {
		T temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static <T extends Comparable<T>> T findMax(List<T> list, int begin, int end) {

		T temp = list.get(begin);

		for (int i = begin; i <= end; i++) {

			if (list.get(i).compareTo(temp) > 0) {
				temp = list.get(i);
			}
		}

		return temp;
	}

	public static <T> void printArray(T[] strArr) {
		for (T a : strArr) {
			System.out.print(a);
		}
		System.out.println();
	}
}

