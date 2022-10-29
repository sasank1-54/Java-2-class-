package JavaTask;

public class Vehicle {
	private String name;
	private String platform;
	public Vehicle(String name, String platform) {
		super();
		this.name = name;
		this.platform = platform;
	}
	
	public void getDetails() {
		System.out.println("The Vehicle Name is: "+this.name);
		System.out.println("___________________________________");
		System.out.println("The Platform is: "+this.platform);
		System.out.println("___________________________________");
	}
}

class Car extends Vehicle{
	private String company;
	private float cost;
	public Car(String name, String platform, String company, float cost) {
		super(name, platform);
		this.company = company;
		this.cost = cost;
	}
	public void getDetails() {
		super.getDetails();
		System.out.println("The Car Company is: "+this.company);
		System.out.println("___________________________________");
		System.out.println("The Car Cost in Lakhs is: "+this.cost);
		System.out.println("___________________________________");
	}
	
}
	

class SportsCar extends Car{
	private String directionsensor;

	public SportsCar(String name, String platform, String company, float cost, String directionsensor) {
		super(name, platform, company, cost);
		this.directionsensor = directionsensor;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("The Sports Car directionSensor is enabled: "+this.directionsensor);
	}
}
