
public class EmployeeConstructor {
	String name;
	int eid;
	public EmployeeConstructor(String ename , int emp_id) {
		name = ename;
		eid = emp_id;
	}
	 void printDetails() {
		System.out.println("Employee name is " +name);
		System.out.println("Employee id is "+eid);
	}
	
	public static void main(String[] args) {
//		EmployeeConstructor  e = new EmployeeConstructor();	
//		e.name = "Navya";
//		e.eid = 111;
//		
//		EmployeeConstructor  e1 = new EmployeeConstructor();
//		e1.name = "Sharvari";
//		e1.eid = 222;
//		
//		EmployeeConstructor  e2 = new EmployeeConstructor();
//		e2.name = "Amando";
//		e2.eid = 333;
		
		EmployeeConstructor e1 = new EmployeeConstructor("navya", 100);
		e1.printDetails();
		EmployeeConstructor e2 = new EmployeeConstructor("sharvari", 200);
		e2.printDetails();
		EmployeeConstructor e3 = new EmployeeConstructor("amando", 300);
		e3.printDetails();
		
		
		}

}
