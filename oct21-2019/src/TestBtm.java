
public class TestBtm {
public static void main(String[] args) {
	BTM b = new BTM();
	b.swipe();
	int count = b.getCount();
	System.out.println("count is "+count);
	int Totcount = b.getTotCount();
	System.out.println("Total count is "+Totcount);
	
	BTM b1 = new BTM();
	b1.swipe();
	int count1 = b1.getCount();
	System.out.println("count is "+count1);
	int Totcount1 = b1.getTotCount();
	System.out.println("Total count is "+Totcount1);
	
	
}
}
