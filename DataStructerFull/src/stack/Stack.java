package stack;

public class Stack {

	private int top;
	private int [] arr;
	
	// constructors
	public Stack(int capacity) {
		top=-1;
		arr= new int[capacity];
	}
	public Stack() {
		this(10); // default capacity
	}
	// push
	public void push(int data) {
		if(isFull()) {
			throw new RuntimeException("Stack is full !!!");
		}
		top++;
		arr[top]=data;
	}
	
	// pop
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		int result=arr[top];
		top--;
		return result;
	}
	
	public int peak() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is full !!!");
		}
		return arr[top];
	}
	
	private boolean isEmpty() {
		return top<0;
	}
	public boolean isFull() {
		return arr.length==size();
	}
	private int size() {
		return top+1;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push(5);
		stack.push(10);
		stack.push(15);
		System.out.println(stack.isFull());
		stack.pop();
		System.out.println(stack.peak());
		System.out.println(stack.isEmpty());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.peak());
			stack.pop();
		}
	}
	
}
