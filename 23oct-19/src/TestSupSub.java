
public class TestSupSub {
public static void main(String[] args) {
	SuperClass sup = new SuperClass();
	sup.count();
	System.out.println("---------------------------------");
	SubClass sub = new SubClass();
	sub.count();
	System.out.println("---------------------------------");
	sub.add();
}
}
