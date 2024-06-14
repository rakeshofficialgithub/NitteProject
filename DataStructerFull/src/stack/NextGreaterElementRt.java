package stack;
import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElementRt {
	
	private static int [] nextGreaterElment(int[] arr) {
		Stack <Integer> stack=new Stack<Integer>();
		int [] result =new int[arr.length];
		
		  for(int i=arr.length-1;i>=0;i--) {
			  if(!stack.isEmpty()) {
				   while(!stack.isEmpty()&&stack.peek()<=arr[i]) {
					   stack.pop();
				   }
			  }
			  if(stack.isEmpty()) {
				  result[i]=-1;
			  }
			  else {
				  result[i]=stack.peek();
			  }
			  stack.push(arr[i]);
		  }
		return result;
		
	}


	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the size");
     int size = sc.nextInt();
     int [] arr = new int[size];
     System.out.println("enter the array elements");
     
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=sc.nextInt();
     }
    int [] result= nextGreaterElment(arr);
    for(int i=0;i<result.length;i++) {
    	System.out.print(result[i]+" ");
    }
	
	}

	
}
