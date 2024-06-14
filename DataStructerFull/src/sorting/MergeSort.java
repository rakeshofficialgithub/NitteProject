package sorting;
import java.util.Scanner;
public class MergeSort {
	public static void conquer(int arr[],int si,int mid,int ei) {
		int merged[]=new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int x=0;	
		while(idx1<=mid && idx2<=ei) {
			// x is used to track the index of sorted array
			if(arr[idx1]<=arr[idx2]) {
				merged[x++]=arr[idx1++];
//				merged[x]=arr[idx1]
//				x++,idx1++;
			}else {
				merged[x++]=arr[idx2++];
			}
		}
		while(idx1<=mid) {
			merged[x++]=arr[idx1++];
		}
		while(idx2<=ei) {
			merged[x++]=arr[idx2++];
		}
		
		// converting merged array elemnt into original array element
		for(int i=0,j=si;i<merged.length;i++,j++) {
			arr[j]=merged[i];
		}
	}
	
	public static void mergeDevide(int arr[],int si,int ei) {
		// single element condition
		
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		mergeDevide(arr,si,mid);
		mergeDevide(arr,mid+1,ei);
		conquer(arr,si,mid,ei);
		
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
		System.out.println();
		int n = arr.length;
		 mergeDevide(arr, 0, n-1);
		 
		 for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
	}
}