package queue;

import java.util.NoSuchElementException;

public class QueueLL {

	private ListNode front;
	private ListNode rear;
	private int length;

	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length==0;
	}
	
	public QueueLL() {
		this.front=null;
		this.rear=null;
		this.length=0;
	}
	
	// enqueue
	public void add(int data) {
		ListNode temp = new ListNode(data);
		if(isEmpty()) {
			front=rear=temp;
		}
		else {
			rear.next=temp;
		}
			rear=temp;
			length++;
		}
	public int remove() {
	if(isEmpty()) {
		throw new NoSuchElementException();
//		System.out.println("empty queue !! no element to remove");
//		return -1;
	   }
	int result =front.data;
	front = front.next;
	if(front==null) {
		rear=null;
	 }
	length--;
	return result;

  }
	public int first() {// peek();
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return front.data;
	}
	
	public int Last() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return rear.data;
	}
	
	//print the data
	public void print() {
		if(isEmpty()) {
			return;
		}
		ListNode current =front;
		while(current!=null) {
			System.out.print(current.data+"  --->");
			current =current.next;
		}
		System.out.println("null");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("start");
		QueueLL q = new QueueLL();
		q.add(1);
		q.add(2);
		q.add(3);
		q.print();
		q.remove();
		q.print();
		
	System.out.println(q.isEmpty());
	}

}
