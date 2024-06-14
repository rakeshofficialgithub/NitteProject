package arrays;

import java.util.Scanner;

public class StopClockStillRunning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of time StopWatch is pressed");
		int n= sc.nextInt();
		System.out.println("enter the number of seconds displayed on the timer of the stopwatch");
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		if(n%2==1) {
			System.out.println("still running");
		}
		else {
			int time =0;
			for(int i=0;i<n;i+=2) {
				time+=a[i+1]-a[i];
			}
			System.out.println("total running time = "+time);
		}
	}
}
