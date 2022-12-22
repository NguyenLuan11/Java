package lab1;

import java.util.Scanner;

public class Author {
	private String name;
	private String email;
	private String gender;
	
	Author(){
		
	}
	
	public void Author(String name, String email, String gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Author{" +
				"name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
	}

	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap ten tac gia: ");
		this.name = sc.nextLine();
		System.out.print("Nhap email tac gia: ");
		this.email = sc.nextLine();
		System.out.print("Nhap gioi tinh tac gia: ");
		this.gender = sc.nextLine();
	}
	

	public void Output() {
		System.out.println("Ten: "+ name);
		System.out.println("Email: "+ email);
		System.out.println("Gioi tinh: "+ gender);
	}
}
