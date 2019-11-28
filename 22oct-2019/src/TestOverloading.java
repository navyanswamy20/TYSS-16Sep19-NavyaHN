
public class TestOverloading {
	public static int add(int a , int b)
	{
		System.out.println("add(int a , int b) method");
		return a + b;
	}
	public static long add(int a , byte b)
	{
		System.out.println("add(int a , byte b) method");
		return a + b;
	}
	
	public static long add(long a , int b)
	{
		System.out.println("add(long a , int b) method");
		return a + b;
	}

	public int mul(int a,int b) {
		System.out.println(" mul(int a,int b) method");
		return a + b;
	}
	
	public int mul(byte a,int b) {
		System.out.println(" mul(byte a,int b) method");
		return a + b;
	}
	
public static void main(String[] args) {
	System.out.println("main(String[] args) method");
	main(10);
	add(10,12);
	add(12,34);
	add(98,56);
	
	TestOverloading t = new TestOverloading();
	t.mul(2, 5);
	t.mul(10, 10);
	
}
//main method can be overloaded but it will executes only when we call 
public static void main(int a) {
	System.out.println("main(int a) method");
	
}
}
