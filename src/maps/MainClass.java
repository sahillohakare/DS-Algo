package maps;
import java.util.*;
import java.util.Map.Entry;

public class MainClass {
	public static void main(String args[]) {
//		Map<String,Integer> numbers = new HashMap();
//		numbers.put("One", 1);
//		numbers.put("Two", 2);
//		numbers.put("Three", 3);
//		numbers.put("Five", 5);
//		numbers.putIfAbsent("One", 10);//overwrites


		//System.out.println(numbers.get("Two"));
		//System.out.println(numbers.containsKey("Two"));
		//Iterate
		//EntrySet gives us set of entries
//		Set <Entry<String,Integer>> entries = numbers.entrySet();
//		for(Entry<String,Integer> entry: entries) {
//			entry.setValue(entry.getValue()*100);
//			
//		}
		System.out.println(getHash("CAT"));
		System.out.println(getHash("DOG"));
		System.out.println(getHash("GOD"));
		System.out.println(getHash("BALL"));
	}
//		System.out.println(numbers);
		public static int getHash(String s) {
			int hash = 0;
			for(int i = 0;i<s.length();i++) {
				hash = hash +s.charAt(i);
				
			}
			return hash;
		}


}
