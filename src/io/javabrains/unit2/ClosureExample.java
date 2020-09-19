package io.javabrains.unit2;

public class ClosureExample {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		/*// JAVA 7
		doProcess(a,new Process(){

			@Override
			public void process(int i) {
				//b=20; //unable to override b here.b is acting like final variable
				System.out.println(a+b);
				
			}
			
		});*/

		//JAVA 8
		doProcess(a,i->System.out.println(i+b));
	}

	private static void doProcess(int i,Process p){
		p.process(i);
	}
	interface Process{
		public void process(int i);
	}
}
