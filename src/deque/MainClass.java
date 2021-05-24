package deque;

import java.util.ArrayDeque;

public class MainClass {
	public static void main(String args[]) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
	//These are queue functions
//		ad.addFirst(12);
//		ad.addFirst(34);
//		ad.pop();
		//System.out.println(ad.peek());
		//Now we use it as Stack
		ad.push(12);
		ad.push(34);
		ad.push(13);
		System.out.println(ad.pop());
		System.out.println(ad.pop());
	}
	
}
