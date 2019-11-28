
public class StudentFinal {
	String name;
	int rollno;
	final String Clgname = "BIT";
	final int cid;
	StudentFinal(String name,int rollno,int cid){
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}
	final void printDetails() {
		System.out.println("hi "+name+" welcome to "+Clgname);
	}
	final void printDetails(String name) {
		System.out.println("hi "+name+" welcome to "+Clgname);
	}
}
