package io.javabrains.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
	
		
		
		
		//lambda
		//Thread t = new Thread(()-> printMessage());
		
		//method reference
		Thread t = new Thread(MethodReferenceExample1::printMessage); //MethodReferenceExample1::printMessage === ()-> printMessage() 
		t.start();
	}

	public static void printMessage(){
		System.out.println("Hello ");
	}
	
	
}
