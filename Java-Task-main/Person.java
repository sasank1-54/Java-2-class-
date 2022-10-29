package JavaTask;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void getDetails() {
		System.out.println("The Name of the Person is: "+this.name);
		System.out.println("The Age of the Person is: "+this.age);
	}
}

class Teacher extends Person{
	float salary;

	public Teacher(String name, int age, float salary) {
		super(name, age);
		this.salary = salary;
		
	}
	public void getDetails() {
		super.getDetails();
		System.out.print("The Salary is:"+this.salary);   
	}
	
}