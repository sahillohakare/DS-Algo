package lists.LinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
		LLImplementation<String> myLL =  new LLImplementation();
		
		for(int i = 0;i<10;i++) {
			myLL.add(i+" added");
		}
		
		myLL.print();

	}

}
