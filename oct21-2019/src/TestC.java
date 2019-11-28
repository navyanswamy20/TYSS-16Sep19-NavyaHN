
public class TestC {
	public static void main(String[] args) {
		Person.color = "white";
		Person.sleep();
		Person p1= new Person();
		p1.age=20;
		p1.nmae = "navya";
		
		System.out.println("name of the person is "+p1.nmae);
		System.out.println("age of the person age is "+p1.age);
		System.out.println("color of person is " +Person.color);
		
		Person p2 = new Person();
		p2.age=25;
		p2.nmae = "sharvari";
		System.out.println("name of the person 2 is "+p2.nmae);
		System.out.println("age of the person age 2 is "+p2.age);
		
	}

}
