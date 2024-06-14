package queue;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
	while(!q.isEmpty()) {
		System.out.print(q.peek()+" ");
		q.remove();
	}
	
	System.out.println("\n=================================");
	Queue <Integer> q1 = new LinkedList<Integer>();
	q1.add(6);
	q1.add(7);
	q1.add(8);
	q1.add(9);
	q1.add(10);
	
	
	while(!q1.isEmpty()) {
		System.out.print(q1.peek()+" ");
		q1.remove();
	}
	
	
	}
	
	

}
