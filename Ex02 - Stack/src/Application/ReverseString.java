package Application;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		System.out.println("Reverse String:");
		
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
		
		sc.close();

	}

}
