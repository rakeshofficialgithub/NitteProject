package sorting;
import java.util.*;
public class QuickSort {
	
	public static void quickSort(int [] arr,int low,int high) {
			if(low<high) {
				int pIdx=partition(arr,low,high);
				 quickSort(arr,low, pIdx-1);
				 quickSort(arr,pIdx+1,high);
			}
			
			
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int i=low-1;// provide space for sorted array elements
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
			// swapping and store it before pivot
				int temp=arr[i];//
				arr[i]=arr[j];//
				arr[j]=temp;
			}
		}
		// provide space for pivot and return the pivot index
		i++;
		System.out.println(arr[i]);
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int n = arr.length;
		 quickSort(arr, 0, n-1);
		 
		 
		 for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		
		
	}

}
