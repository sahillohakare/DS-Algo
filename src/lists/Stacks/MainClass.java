package lists.Stacks;

import java.util.Stack;

public class MainClass {

	public static void main(String[] args) throws Exception {
		Mystack<Integer> stack = new Mystack<Integer>();
		
		int popped = stack.pop();
		int peeked = stack.peek();
		
		
		System.out.println("popped element "+popped);
		System.out.println("peek element "+peeked);
	}

}
