
public class StaticBlock {
	static int a;
	int b;
	static 
	{
		a = 10;
		System.out.println("static block 1");
	}
	StaticBlock(){
		System.out.println("Static block constructor");
	}
	public static void main(String[] args) {
		StaticBlock b = new StaticBlock();
		StaticBlock b1= new StaticBlock();
		System.out.println("value of a is "+a);

	}
	static
	{
		a = 20;
		System.out.println("static block 2");
	}
	static
	{
		a = 30;
		System.out.println("static block 3");
	}

}
