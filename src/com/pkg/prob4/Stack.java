package com.pkg.prob4;

public class Stack<T> {
	private int size = 0;
	private int top = -1;

	@SuppressWarnings("unchecked")
	private T[] arr = (T[]) new Object[10];

	public void push(T t) {
		arr[++top] = t;
		size++;

	}

	public T pop() {
		T t = arr[top];
		top--;
		size--;
		return t;
	}

	public T peek() {
		T t = arr[top];
		return t;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {

		return size == -1;
	}

	public static void main(String[] args) {

		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(1);
		stack1.push(2);
		System.out.println(stack1.getSize());
	}
}
