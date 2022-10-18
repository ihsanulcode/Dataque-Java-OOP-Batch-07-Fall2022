
public class Student {
	//data fields
	String name;
	int id;
	double cgpa;
	
	//default constructor
	Student(){
		this.name = "N/A";
		this.id = 0;
		this.cgpa = 0.0;
	}
	
	//argument constructor
	Student(String name,int id,double cgpa){
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
	}
	
	//methods
	public void Profile() {
		System.out.println("Name: "+this.name);
		System.out.println("ID: "+this.id);
		System.out.println("CGPA: "+this.cgpa);
	}

}