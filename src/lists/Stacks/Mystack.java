package lists.Stacks;

import java.util.LinkedList;
import java.util.List;

import lists.LinkedList.LLImplementation;

public class Mystack<E> {
	
	private LLImplementation<E> ll = new LLImplementation();
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Empty stack popping is not allowed");
			
		}
		return ll.removeLast();
	}
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Empty stack peeking is not allowed");
			
		}
		return ll.getLast();
		
	}
}
