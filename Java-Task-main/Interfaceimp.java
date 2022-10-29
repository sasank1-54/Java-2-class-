package JavaTask;

interface intr1{
	public void studentDetails();
	public void teacherDetails();
}
class person implements intr1{
	@Override
	public void studentDetails() {
		System.out.println("This Shows the Detials of the Student");
	}

	@Override
	public void teacherDetails() {
		System.out.println("This Shows the Details of the Teacher");
	}
}






public class Interfaceimp {
	public static void main(String[] args) {
		person p = new person();
		p.studentDetails();
		p.teacherDetails();
	}
}
