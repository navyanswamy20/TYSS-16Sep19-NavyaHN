
public class Bus {
	int seat;
	String color;
	public Bus(int seat,String color) {
		this.seat = seat;
		this.color = color;
	}
	public Bus() {
		this(40);
	}
	public Bus(int seat) {
		this(seat,"red");
	}
	void getDetails() {
		System.out.println("welcome to red bus,bus seat capacity is " +seat+" and the color is "+color);
	}
}
