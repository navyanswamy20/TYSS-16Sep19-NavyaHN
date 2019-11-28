
public class TestInheritance {
public static void main(String[] args) {
	FirstGen f = new FirstGen();
	SecodGen s = new SecodGen();
	ThirdGen t = new ThirdGen();
	f.call();
	f.msg();
	System.out.println("***********************************");
	s.call();
	s.msg();
	s.games();
	System.out.println("***********************************");
	t.call();
	t.camera();
	t.games();
	t.msg();
	
	
}
}
