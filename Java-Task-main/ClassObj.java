package JavaTask;

class EmployeeDetails{
		private String name;
		private int id;
		private String company;
	public EmployeeDetails(String name, int id, String company){
		 this.name = name;
		 this.id = id;
		 this.company = company;
	}
	public void print(){
		System.out.println("The Name of the Employee is: "+this.name);
		System.out.println("The ID of the Employee is: "+this.id);
		System.out.println("The Company in Which the Employee Works is: "+this.company);
	}	
	
} 


public class ClassObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails ed = new EmployeeDetails("Siva Vanapalli", 557,"Tata Elxsi");
		ed.print();
	}
	
}

