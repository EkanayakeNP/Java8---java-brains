package io.javabrains.unit2;

public class ThisReferenceExample {

	public static void main(String[] args) {

		ThisReferenceExample tr = new ThisReferenceExample();
		
		//unable to call this keyword like this-------
		/*tr.doProcess(10, i->{
			System.out.println(this);
		});*/
		
		tr.execute();
	}

	public void doProcess(int i, Process1 p) {
		p.process1(i);
	}

	public void execute(){
		doProcess(10,i->{
			System.out.println(this);
		});
	}
	
	
}

interface Process1{
	void process1(int i);
}
