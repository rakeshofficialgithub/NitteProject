package sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void printArray(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
//  6 3 5 4 1 2
	// 1 3 5 4 6 2
	// 1 2 4 5 6 3
	// 1 2 3 5 6 4
	// 1 2 3 4 6 5
	// 1 2 3 4 5 6
	//
//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int [] arr =new int[size];
		System.out.println("enter the array elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		
		printArray(arr);
		
	}

}
