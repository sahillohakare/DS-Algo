package oops.polymorphism;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		dog d = new dog();
		pet p = d;
		//Animal a =d;
		System.out.println(d.name);
		System.out.println(p.name);//not overriding
//		d.walk();
//		p.walk();
//		//Dog is walking
//		//Dog is walking
//		//now  method overloading
//		greetings();
//		greetings("HElloo biyach");
//		greetings("printing this line 10times",10);

	}
	public static void greetings(){
		System.out.println("hi there");
	}
	public static void greetings(String s){
		System.out.println(s);
	}
	public static void greetings(String s,int count){
		
		for(int i = 0;i<count;i++) {
			System.out.println(s);
		}
	}

}
