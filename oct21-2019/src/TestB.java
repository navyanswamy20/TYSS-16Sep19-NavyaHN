
public class TestB {
	public static void main(String[] args) {
		Cow c=new Cow();
		c.name="Bhoomika";
		c.color="black n white";
		System.out.println("name of the cow is " +c.name);
		System.out.println("coclor of the cow is "+c.color);
		c.eat();
		c.sleep();

		System.out.println("***********************************");
		Cow c1=new Cow();
		c1.name="Rani";
		c1.color="brown";
		System.out.println("name of the cow1 is" +c1.name);
		System.out.println("coclor of the cow1 is "+c1.color);
		c1.eat();
		c1.sleep();
	}

}
