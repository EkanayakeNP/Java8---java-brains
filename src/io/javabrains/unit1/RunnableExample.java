package io.javabrains.unit1;

public class RunnableExample {

	public static void main(String[] args) {
	/*	Thread myThread = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Inside the runnable");
				
			}
			
		});*/
		
		
		Thread myThread = new Thread(()->System.out.println("Inside the runnable with lambda"));
		myThread.start();

	}

}
