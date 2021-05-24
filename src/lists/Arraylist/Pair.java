package lists.Arraylist;

public class Pair<X,Y> {
	X x;
	Y y;
	public Pair(X x,Y y) {
		this.x = x;
		this.y = y;
				//Generic class
	}
	public void getDescription() {
		System.out.println(x +" and "+y);
		
	}

}
