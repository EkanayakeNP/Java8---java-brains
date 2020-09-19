package io.javabrains.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.unit2.Persion;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Persion> people = Arrays.asList(
				new Persion("Nishantha","Ekanayake",31),
				new Persion("kamal","santha",30),
				new Persion("amila","Eumara",29)
				);

		
		
		//step 2:Create method that print all elements in list
		performConditionally(people,p->true,System.out::println);	 // System.out::println act like p->printMessage(p)
		
			
	
	}


	
	//can change above method using java.util.function package test interface
	private static void performConditionally(List<Persion> people,Predicate<Persion> condition,Consumer<Persion> consumer) {
		System.out.println("------------------------");
		for(Persion p : people){			
			if(condition.test(p)){
				consumer.accept(p);
			}
		}
		
	}
	


}
