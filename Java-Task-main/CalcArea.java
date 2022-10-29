package JavaTask;

import java.util.Scanner;

class Room {
	private float length;
	private float width;
	private float height;
	
	
	
	public Room(float length, float width, float height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public void calcArea() {
		float area = length*width;
		System.out.println("The Area of the Given Room: "+area);
	}
	public void calVolume() {
		float volume = length*width*height;
		System.out.println("The Volume of the Given Room: "+volume);
	}
}


public class CalcArea{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float l,w,h;
		System.out.println("Enter the Length, Height and Width of the Room(P.S: Hit the enter button after every value): ");
		l = sc.nextFloat();
		w = sc.nextFloat();
		h = sc.nextFloat();
		
		Room r = new Room(l,w,h);
		r.calcArea();
		r.calVolume();
	}
}