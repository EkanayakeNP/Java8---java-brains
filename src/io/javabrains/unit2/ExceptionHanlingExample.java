package io.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHanlingExample {

	public static void main(String[] args) {

		int[] someNumbers = { 1, 2, 3 };
		int key = 0;

		//methd 1
	/*	process(someNumbers, key,(x,y)->{
			try{
				System.out.println(x/y);
			}catch(ArithmeticException e){
				System.out.println("Arithmatic Exception");
			}
		});*/

		 process(someNumbers,key,wapperLambda((v,k)-> System.out.println(v/k)) );
	}

	
	//method 2
	
	
	
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer,Integer> wapperLambda(BiConsumer<Integer,Integer> consumer){
		
		return(v,k)->{
			try{
				consumer.accept(v, k);
			}catch(ArithmeticException e){
				System.out.println("Exception coutch by wrapper lambda");
			}
		};
		
		
	}
}
