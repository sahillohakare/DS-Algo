package oops.ExceptionHandling;

public class MainClass {
	public static void main(String args[]) {
	
		fun1();
		System.out.println("VIMP code");
		
	}
	static void fun1() {
		int a = 6;
		int b = 2;
		int c = a/b;
		System.out.println("Division is"+c);
		try{
			fun2();
		}catch(Exception e){
			System.out.println(e.getMessage()+" occured");
		}
		
	}
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
		}
	}
}
