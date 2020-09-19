package io.javabrains.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StanderdFunctionalInterfaceExample {

	public static void main(String[] args) {
		List<Persion> people = Arrays.asList(
				new Persion("Nishantha","Ekanayake",31),
				new Persion("kamal","santha",30),
				new Persion("amila","Eumara",29)
				);

		//step 1 : sort ist by last name
		Collections.sort(people, ( p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
			
		
		
		//step 2:Create method that print all elements in list
		performConditionally(people,p->true,p->System.out.println(p));
		
		//step 3: Create a method that prints all peoples that  have last name begining with c
		
		performConditionally(people,p-> p.getLastName().startsWith("E"),p->System.out.println(p));
			
	
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


