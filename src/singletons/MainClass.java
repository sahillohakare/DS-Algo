package singletons;

public class MainClass {

	public static void main(String[] args) {
		AppConfig obj = AppConfig.getInstance();
		AppConfig obj1 = AppConfig.getInstance();
		AppConfig obj2 = AppConfig.getInstance();
		AppConfig obj3 = AppConfig.getInstance();
		AppConfig obj4 = AppConfig.getInstance();
		//These objects are all same they are not created again and again but accessed again and again
		//Used for code optimization

	}

}
