package lists.Arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
	public static void main(String args[]) {
		//List<String> fruits = new LinkedList();
		List<String> fruits = new ArrayList();
		//List<String> vegetables = new LinkedList();
		//you can use it like this too for that always 
		//use Top class as list then create object of the type you want
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Watermelon");
//		String temp[] = new String[fruits.size()];
//		fruits.toArray();
//		for(String e:temp) {
//			System.out.println(e);
//		}
//		fruits.isEmpty();
//		System.out.println(fruits.contains("Banana"));
		//fruits.size();
//		List<String> toRemove = new ArrayList();
//		toRemove.add("Apple");
//		toRemove.add("Watermelon");
//		fruits.removeAll(toRemove);
		//fruits.clear();
		
		
		//fruits.remove(2);
		
		
		//fruits.set(1, "Banana");
//		vegetables.add("potato");
//		vegetables.add("Tomsto");
//		fruits.addAll(vegetables);
		System.out.println(fruits);
		//System.out.println(fruits.get(1));
		ArrayList<Integer> marks = new ArrayList<Integer>();
		Pair<String,Integer> p1 = new Pair("Anuj",457);
		Pair<Boolean,String> p2 = new Pair(true,"hello");
		p1.getDescription();
		p2.getDescription();
	}
	
}
//Methods of arraylist :get,addAll,add,set,remove,removeAll,clear(faster),size
//contains,toArray
