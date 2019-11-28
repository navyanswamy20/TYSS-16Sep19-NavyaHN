
public class StudentTest {
public static void main(String[] args) {
	Student.cname = "BIT";
	Student s =new Student();
	s.usn = 25;
	s.name = " Navya";
	s.read();
	System.out.println("Name of the college is "+Student.cname) ;
	System.out.println("Name of the student is "+s.name);
	System.out.println("USN of the student is "+s.usn);
}
}
