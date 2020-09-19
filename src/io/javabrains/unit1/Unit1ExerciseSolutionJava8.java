package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Persion> people = Arrays.asList(
				new Persion("Nishantha","Ekanayake",31),
				new Persion("kamal","santha",30),
				new Persion("amila","Eumara",29)
				);

		//step 1 : sort ist by last name
		Collections.sort(people, ( p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
			
		
		
		//step 2:Create method that print all elements in list
		printConditionally(people,p->true);
		
		//step 3: Create a method that prints all peoples that  have last name begining with c
		
		printConditionally(people,p-> p.getLastName().startsWith("E"));
			
	
	}



	private static void printConditionally(List<Persion> people,Condition condition) {
		System.out.println("------------------------");
		for(Persion p : people){			
			if(condition.test(p)){
				System.out.println(p);
			}
		}
		
	}
	


}


