package com.pkg.prob3;

import java.util.List;

public class Thirdproblem {

	public static <T extends Number> double sumOfElements(List<T> elements) {
		double sum = 0;
		T t1 = elements.get(0);
		elements.add(t1);

		for (T t : elements) {
			sum = sum + t.doubleValue();
		}
		return sum;

	}
}
