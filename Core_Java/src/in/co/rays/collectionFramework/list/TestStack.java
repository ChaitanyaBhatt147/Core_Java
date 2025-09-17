package in.co.rays.collectionFramework.list;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		Stack s2 = new Stack();
		
		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);
		}
		System.out.println("Stack: "+ s);
		System.out.println(s.peek());
		while (!s.isEmpty()) {
			s2.push(s.pop());
		}
		System.out.println("Stack1: "+ s);
		System.out.println("Stack2: "+ s2);		
	}
}
