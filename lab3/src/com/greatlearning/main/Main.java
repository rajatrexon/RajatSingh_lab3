package com.greatlearning.main;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		System.out.println("Enter the input");
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		int i = 0;
		while (i < expression.length()) {
			switch (expression.charAt(i)) {
			case '(':
				stack.push('(');
				break;
			case ')':
				if (stack.peek() == '(') {
					stack.pop();
				}
				break;
			case '{':
				stack.push('{');
				break;
			case '}':if (stack.peek() == '{') {
				stack.pop();
			}
				break;
			case '[':
				stack.push('[');
				break;
			case ']':
				if (stack.peek() == '[') {
				stack.pop();
				}
				break;
			default:
				System.out.println("Enter correct value");
				break;
			}
			i++;

		}
		if (stack.isEmpty()) {
			System.out.println("balanced brackets");
		} else {
			System.out.println("unbalanced brackets");
		}

	}

}
