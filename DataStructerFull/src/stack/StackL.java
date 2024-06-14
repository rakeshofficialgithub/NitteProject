package stack;

import java.util.EmptyStackException;


public class StackL{
	private ListNode top;
	private int length;
	
	private class ListNode{
	private int data;
	private ListNode next;
	  
	 public ListNode(int data) {
		 this.data=data;
	 }
	}
	 public StackL() {
		 top=null;
		 length=0;
	 }
	 
	 public int length()      {	 return length;  }
	 public boolean isEmpty() { return length==0;}
	 
	 public void push(int data) {
		 ListNode temp = new ListNode(data);
		 temp.next=top;
		 top=temp;
		 length++;
	 }
	 
	 public int pop() {
		 if(isEmpty()) {
			 throw new EmptyStackException();
		 }
		 int result =top.data;
		 top=top.next;
		 length--;
		 return result;
	 }
	 
	 public int peek() {
		 if(isEmpty()) {
			 throw new EmptyStackException();
		 }
			return top.data;
	 }
	
	 

	public static void main(String[] args) {
		
		StackL s = new StackL();
		System.out.println(s.isEmpty()); //true
		System.out.println(s.length);    // 0
		s.push(5);
		s.push(10);
		s.push(7);
		
		
		System.out.println(s.peek());  // 7
		System.out.println(s.length);  // 3
		
		// removing data from the top
		
		s.pop();
		System.out.println(s.peek());  // 10
		System.out.println(s.length);  // 2
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}		
	}
}