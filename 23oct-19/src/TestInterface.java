
public class TestInterface {
public static void main(String[] args) {
	Automobile a; //we can create the reference variable for the interface.
	BMW b =new BMW();
	b.gear();
	b.gps();
	b.abs();
	System.out.println("-----------------------------");
	Toyoto t = new Toyoto();
	t.gear();
	t.gps();
	
	}
}
