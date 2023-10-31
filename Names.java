import java.util.*;
class Student{
	String name;
	Student(){
		this.name = "unknown";	
	}
	
	Student(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}

class Names{
	public static void main(String args[]){
		Student std1 = new Student();
		Student std2 = new Student("Adithyan");
	
		System.out.println("name:"+ std1.getName());
		System.out.println("name:"+ std2.getName());
	}
}
