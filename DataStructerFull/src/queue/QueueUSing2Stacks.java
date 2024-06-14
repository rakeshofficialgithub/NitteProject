package queue;

import java.util.Stack;

public class QueueUSing2Stacks {

	private static class Queue{
		static Stack<Integer> s1=new Stack<Integer>();
		static Stack<Integer> s2=new Stack<Integer>();
		
		public static boolean isEmpty() {
			return s1.isEmpty();
		}
		// put all the s1 elements from s1 to s2
		// add element to s1 
		// copy all the element from s2 to s1
		public void add(int data) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(data);
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		
		public static int remove() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			return s1.pop();
		}
		
		public static int peek() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			return s1.peek();
		}
		
		public static void main(String[] args) {
			Queue q = new Queue();
			q.add(1);
			q.add(2);
			q.add(3);
			q.add(4);
			q.add(5);
			
			while(!q.isEmpty()) {
				System.out.print(q.peek()+" ");
				q.remove();
			}
		}
		
	}
}
/**
 
if s1 is empty add 1 in s1
to add 2 copy all the s1 elements to s2
then add 3 
to add 3 copy all the element from  s1 to  s2
then add 4
copy all element from   
 

* 
 */
