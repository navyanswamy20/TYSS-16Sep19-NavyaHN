

public class TestThis {
	String name;
	int eid;
	public TestThis(String name , int eid) {
		this.name = name;
		this.eid = eid;
	}
	 void printDetails() {
		System.out.println("Employee name is " +name);
		System.out.println("Employee id is "+eid);
		this.sayHello();
	}
	 void sayHello() {
		 System.out.println("hello "+name+" Welcome to TestYantra");
	 }
	
	public static void main(String[] args) {
		
		TestThis e1 = new TestThis("navya", 100);
		e1.printDetails();
		TestThis e2 = new TestThis("sharvari", 200);
		e2.printDetails();
		TestThis e3 = new TestThis("amando", 300);
		e3.printDetails();
		
		
		}

}
