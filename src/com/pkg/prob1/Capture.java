package com.pkg.prob1;

import java.util.Arrays;
import java.util.List;

public class Capture {

	public static void reverse(List<?> list) {
		reverseIn(list);
	}

	public static <T> void reverseIn(List<T> items) {

		for (int i = items.size() - 1; i >= 0; i--) {
			System.out.println(items.get(i));
		}
	}

	public static void main(String[] args) {

		List<String> listofString = Arrays.asList("alu", "kalu", "shalu");
		Capture.reverse(listofString);
		List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5, 6);
		Capture.reverse(listOfInteger);

	}

}
