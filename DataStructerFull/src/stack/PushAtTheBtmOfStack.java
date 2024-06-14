package stack;
import java.util.Stack;
public class PushAtTheBtmOfStack {
	
	private static void pushAtBottom(int data, Stack<Integer> s) {
		
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		
		int top =s.pop();
		pushAtBottom(data,s);
		s.push(top);
		}	
		
	
	// REVERSE A STACK

	private static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop(); //get the top
		reverse(s);        // reverse the small stack
		pushAtBottom(top,s); // push the elements at the bottom
		
	}

	
	
	

	public static void main(String[] args) {

		Stack <Integer>s=new Stack(); 
		s.push(1);
		s.push(2);
		s.push(3);
		pushAtBottom(4,s);
		reverse(s);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
			
		}
	}
}
