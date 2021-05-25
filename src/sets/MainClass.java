package sets;
import java.util.*;

public class MainClass {
	public static void main(String args[]) {
//		#Constant time
//		Set<String> fruits = new HashSet<>();
//		fruits.add("Apple");
//		fruits.add("Watermelon");
//		fruits.add("Bananas");
//		fruits.add("Apple");
//		System.out.println(fruits.add("Kiwis"));
//		System.out.println(fruits.add("Watermelon"));
		
//#not in constant time
//		Set<String> fruits = new LinkedHashSet<>();
//		fruits.add("Apple");
//		fruits.add("Watermelon");
//		fruits.add("Bananas");
//		fruits.add("Apple");
//#Ordered form and maintain properties of set
//		Set<String> fruits = new TreeSet<>();
//		fruits.add("Apple");
//		fruits.add("Watermelon");
//		fruits.add("Bananas");
//		fruits.add("Apple");

//		System.out.println(fruits);
		Set<Integer> x = new HashSet<>();
		x.add(23);
		x.add(1);
		x.add(6);
		Set<Integer> y = new HashSet<>();
		y.add(3);
		y.add(1);
		y.add(16);
		//x.addAll(y);
		//x.retainAll(y);
		//System.out.println(x);
		Set<Integer> z = new HashSet<>();
		z.add(1);
		System.out.println(x.containsAll(z));
		

		
	}
}
