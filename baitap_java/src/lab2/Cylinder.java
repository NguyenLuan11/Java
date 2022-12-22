package lab2;

import java.util.Scanner;

public class Cylinder extends Circle {
	private double height = 1.0;
	
	public void Cylinder(double radius) {
		super.getRadius();
	}
	
	public void Cylinder(double radius, double height) {
		super.getRadius();
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return super.getArea()*this.height;
	}
	
	public double getSxungquanh() {
		return 2*3.14*this.getRadius()*this.height;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu cao hinh tru: ");
		this.height = sc.nextDouble();
	}
	
	public void Output() {
		System.out.println("The tich hinh tru: " + getVolume());
		System.out.println("Dien tich xung quanh hinh tru: " + getSxungquanh());
	}
}
