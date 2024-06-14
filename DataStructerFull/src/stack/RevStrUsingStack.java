package stack;
import java.util.Scanner;
import java.util.Stack;
public class RevStrUsingStack {

	private static String reverse(String str) {
		Stack <Character>s = new Stack<Character>();
		char [] ch =str.toCharArray();
		for(char c: ch) {
			s.push(c);
		}
		for(int i=0;i<ch.length;i++) {
			ch[i]=s.pop();
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str =sc.nextLine();
		System.out.println("before reversing "+str);
		System.out.println("after reversing "+reverse(str));

	}

}
