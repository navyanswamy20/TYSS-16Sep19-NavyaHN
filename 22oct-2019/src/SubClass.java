
public class SubClass extends SuperClass {
	String s = "subclass variable";
	SubClass(){
		//super();
		System.out.println("sub class constructor");
	}
	void getSData()
	{
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		super.superMethod();
		superMethod();//because of inheritance
		
	}
}
