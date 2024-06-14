package arrays;

import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int [] arr =new int[size];
		System.out.println("enter the array elements");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			int largest =arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>largest) {
					largest=arr[i];
				}
			}
			System.out.println(largest);
		
	}

}
