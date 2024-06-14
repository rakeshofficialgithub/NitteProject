package stack;
import java.util.Scanner;
import java.util.Stack;
public class ValidParenthesis {

	private static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char c :s.toCharArray()) {
			if(c=='('||c=='{'||c=='[') {
				stack.push(c);
			}
			else {
				// check whether the string is starting with the closing bracket
				if(stack.isEmpty()) {
				return false;
			}
			else {
				char top = stack.peek();
				if(c==')' && top=='('||c=='}'&&top=='{'||c==']'&&top=='[') {
					stack.pop();
				}
				else {
					return false;
				}
			}
			}
			}
		return  stack.isEmpty();	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String s = sc.nextLine();
		System.out.println(isValid(s));
	}
}