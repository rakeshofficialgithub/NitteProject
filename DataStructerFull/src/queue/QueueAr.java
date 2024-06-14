package queue;

public class QueueAr {

	static int arr [];
	static int size;
	static int rear =-1;
	
	public QueueAr(int n) {
		arr=new int[n];
		this.size=n;
	}
	public QueueAr() {
		this(10);
	}
	
	public static boolean isEmpty() {
		return rear==-1;
	}
	public static boolean isFull() {
		return rear==size-1;
	}
	//enque  O(n)
	public  void add(int data) {
		if(isFull()) {
			System.out.println("queue is full");
			return;
		}
		rear++;
		arr[rear]=data;
	}
	
	//deque  O(n)
	public  int remove() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		int front=arr[0];
		for(int i=0;i<rear;i++) {
			arr[i]=arr[i+1];
		}
		rear--;
		return front;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		return arr[0];
	}
	
	

	
	public static void main(String[] args) {
		QueueAr q = new QueueAr(5);
		q.add(1);
		q.add(2);
		q.add(3);
		
		q.remove();
	while(!q.isEmpty()) {
		System.out.println(q.peek());
		q.remove();
	}
	
	
	}

}
