package queue;
import java.util.*;
public class GenerateBN1toN {
	
	// return generated binary numbers in the form of string 
	public static String[] generateBinaryNumber(int n) {
		String result [] = new String[n];
		Queue <String> q = new LinkedList<String>();
		q.offer("1");
		for(int i=0;i<n;i++) {
			result[i]=q.poll();
			String n1 = result[i]+"0";
			String n2 = result[i]+"1";
			q.offer(n1);
			q.offer(n2);
		}
		return result;
		
	}

	public static void main(String[] args) {

		String [] result=generateBinaryNumber(4);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+"  ");
		}
	}

}
