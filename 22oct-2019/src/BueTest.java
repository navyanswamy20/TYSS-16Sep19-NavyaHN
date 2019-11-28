
public class BueTest {
public static void main(String[] args) {
	Bus b1 = new Bus();
	b1.getDetails();
	Bus b2 = new Bus(55);
	b2.getDetails();
	Bus b3 = new Bus(63,"black");
	b3.getDetails();
}
}
