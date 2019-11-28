
public class Student {
String name;
int USN;
String branch;
String clg_name;
int grade;

public Student(String name , int USN , String branch , String clg_name , int grade) {
	this.name = name;
	this.USN = USN;
	this.branch = branch;
	this.clg_name = clg_name;
	this.grade = grade;
	
}

public void show() {
	for(int i=1;i<=10;i++) {
	System.out.println("Student name is= " +name);
	System.out.println("Student USN is= " +USN);
	System.out.println("Student branch is= " +branch);
	System.out.println("Student college name is= " +clg_name);
	System.out.println("Student grade is= " +grade);
	
	System.out.println("********************"+ i +"**********************");
	}
}

public static void main(String[] args) {
	Student s1 = new Student("navya",10,"mca", "bit",65);
	s1.show();
	Student s2 = new Student("sharvari",20,"bca", "srnm",75);
	s2.show();
	Student s3 = new Student("khaleel",30,"be", "sahyadri",79);
	s3.show();
	Student s4 = new Student("mani",40,"bba", "rv",72);
	s4.show();
	Student s5 = new Student("lalu",50,"bca", "sirmv",55);
	s5.show();
	Student s6 = new Student("kala",60,"bsc", "srnm",89);
	s6.show();
	Student s7 = new Student("varsha",70,"eee", "jnnc",75);
	s7.show();
	Student s8 = new Student("manu",80,"bbm", "dvs",35);
	s8.show();
	Student s9 = new Student("moulya",90,"mech", "rnsit",65);
	s9.show();
	Student s10 = new Student("swamy",100,"cs", "ramayya",95);
	s10.show();
}
}
