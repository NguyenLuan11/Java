package lab2;

import java.util.Scanner;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	Circle(){
		
	}
	
	public void Circle(double radius){
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public String toString() {
		return "Radius"+ "(" + radius + ")," + "color" + "(" + getColor() + ")";
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mau cua hinh tron: ");
		color = sc.nextLine();	
		setColor(color);
		System.out.println("Nhap ban kinh hinh tron: ");
		this.radius = sc.nextDouble();
	}
	
	public void Output() {
		System.out.println(toString());
		System.out.println("Dien tich hinh tron: " + getArea());
	}

}
