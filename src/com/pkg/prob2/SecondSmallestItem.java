package com.pkg.prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestItem {

	public static <T extends Comparable<? super T>> T max1(List<T> list) {
		List<T> sortedList = list.stream().sorted()
				.collect(Collectors.toList());
		return sortedList.get(1);
	}

	public static void main(String[] arg) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(4);
		ints.add(-1);
		System.out.println(max1(ints));

		List<String> strs = new ArrayList<>();
		strs.add("Bob");
		strs.add("Steve");
		strs.add("Tom");
		System.out.println(max1(ints));
		System.out.println(max1(strs));
	}
}
