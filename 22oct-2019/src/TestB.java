
public class TestB {
	 static int a= 25;
	 int x;//it wil have default value as 0
	 
	public static void add() {
		//only final access modifier is supported in local variables
		final int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		TestB t = new TestB();
	System.out.println("x value is "+t.x);
	}
	public static void main(String[] args) {
		add();
			
	}
}