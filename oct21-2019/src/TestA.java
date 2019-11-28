public class TestA {
	public static void main(String[] args) {
		
		Pen p = new Pen();
		
		p.cost = 100;
		p.color ="black";
		p.brand = "writo meter";
		
		System.out.println("cost is: "+p.cost);
		System.out.println("color is: " +p.color);
		System.out.println("brand is: " +p.brand);
		
		p.write();
		
		System.out.println("********************************************");
		
		Van v = new Van();
		v.cost = 500000;
		v.color = "sparking silver";
		
		System.out.println("cost of the van is" +v.cost);
		System.out.println("color of the van is" +v.color);
		
		v.move();
		
		Van v1 = new Van();
		v1.cost = 600000;
		v1.color = "gray";
		
		System.out.println("cost of the van1 is" +v1.cost);
		System.out.println("color of the van1 is" +v1.color);
		
		v1.move();


	}
	
	
	
}
