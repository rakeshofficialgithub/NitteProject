package recursion;

public class NumFromtoN {
	
	// printing numbers in decreasing order
	public static void printDec(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		System.out.print(n+" ");
		printDec(n-1);
		
	}
	
	//  print numbers in an increasing order
	public static void prinInc(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		
		prinInc(n-1);
		System.out.print(n+" ");
		
	}
	
	
	// factorial of a number
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int fnm1=fact(n-1);
		int fn =n*fnm1;
		return fn;
	}
	
	
	// sum of n natural numbers
	
	public static int calcSumOfN(int n) {
		if(n==1) {
			return 1;
		}
		int snm1=calcSumOfN(n-1);
		int sn =n+snm1;
		return sn;
	}
	
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fnm1= fib(n-1);
		int fnm2=fib(n-2);
		int fn =fnm1+fnm2;
		return fn;
	}

	// Array is sorted or not
	public static boolean isSorted(int []arr,int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return isSorted(arr,i+1);
	}
	
	// first occurrence of an element in the array
	public static int firstOccurence(int arr[],int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
		return firstOccurence(arr,key,i+1);
	}
	// last occurrence
	public static int lastOccurrence(int [] arr,int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		int isFound=lastOccurrence(arr,key,i+1);
		if(isFound==-1 &&arr[i]==key) {
			return i;
		}
		return isFound;
		
	}
	
	// power function using recursion
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int xnm1=power(x,n-1);
			int xn=x*xnm1;
			return xn;
	}
	

	// optimized one
	public static int lognPower(int a,int n) {
		if(n==0) {
			return 1;
		}
		int halfPow=lognPower(a,n/2);
		int halfPow2=halfPow*halfPow;
		if(n%2!=0) {
			halfPow2=a*halfPow2;
		}
		return halfPow2;
		
	}
	
	public static int tilingProblem(int n) {
		if(n==0||n==1) {
			return 1;
		}
		// vertical way
		int fnm1=tilingProblem(n-1);
		// Horizontal way
		int fnm2=tilingProblem(n-2);
		int totways=fnm1+fnm2;
		return totways;
	
	}
	
	public static void removeDuplicate(String str,int idx,StringBuffer newStr,boolean map[]) {
		if(idx==str.length()) {
			System.out.println(newStr);
			return ;
		}
		char currChar=str.charAt(idx);
		if(map[currChar-'a']==true) {
			removeDuplicate(str,idx+1,newStr,map);
		}
		else {
			map[currChar-'a']=true;
			removeDuplicate(str,idx+1,newStr.append(currChar),map);
		}
	}
	
	public static int pairing(int n) {
		if(n==1 || n==2) {
			return n;
		}
		// single -- case1
		int fmn1=pairing(n-1);
		// pairing
		int fmn2=pairing(n-2);
		// total pair ways will be
		int pairways=(n-1)*fmn2;
		// Total ways
		int totalWays=fmn1+pairways;
		return totalWays;
		
	}
	
	public static void printBinaryString(int n,int lastPlace,String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		if(lastPlace==0) {
			// we can place 0 or we can place 1
			printBinaryString(n-1,0,str+"0");
			printBinaryString(n-1,1,str+"1");
		}
		else {
			printBinaryString(n-1,0,str+"0");
		}
	}
	public static int optimizedPower(int a,int n) {
		if(n==0) {
			return 1;
		}
		int halfPow2=optimizedPower(a,n/2)*optimizedPower(a,n/2);
		if(n%2!=0) {
			halfPow2=a*halfPow2;
		}
		return halfPow2;
	}
	public static void main(String[] args) {		
//		System.out.println(pairing(3));
		 printDec(10);
//		printBinaryString(4,0,"");
		
	}
		//return pairing(n-1)+(n-1)*pairing(n-2)
}











//public static int height(Node root) {
//	if(root==null) {
//		return 0;
//	}
//	int leftHeight =height(root.left);
//	int rightHeight=height(root.right);
//	int myHeight=Math.max(leftHeight, rightHeight)+1;
//	return myHeight;
//	
//}
