package io.javabrains.unit2;

public class Persion {
	private  String firstName;
	private  String lastName;
	private int age;
	
	
	
	
	
	public Persion(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Persion [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	

	
}
