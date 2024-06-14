package arrays;
import java.util.*;
public class RotatedAtIndexElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n= sc.nextInt();
		System.out.println(" enter the number of rotation");
		int k = sc.nextInt();
		System.out.println(" enter the number of queries");
// queries (1,2)=> we need to find element of rotated array at 1 and 2nd index position
		int q= sc.nextInt();
		
		int[]a = new int[n];
		int [] rotatedArray= new int[n];
		
		System.out.println("enter the array elements of orginal Array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("the array elements are");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
			int newIndex=(i+k)%n;
			rotatedArray[newIndex]=a[i];
		}
		System.out.println();
		
		for(int i=0;i<q;i++) {
	System.out.println("enter the index number to search an element in new rotated array");
			int index = sc.nextInt();
			System.out.println(rotatedArray[index]);
		}
		
	}

}
