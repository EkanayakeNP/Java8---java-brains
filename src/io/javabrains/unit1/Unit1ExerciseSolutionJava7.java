package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Persion> people = Arrays.asList(
				new Persion("Nishantha","Ekanayake",31),
				new Persion("kamal","santha",30),
				new Persion("amila","Eumara",29)
				);

		//step 1 : sort ist by last name
		Collections.sort(people, new Comparator<Persion>() {

			@Override
			public int compare(Persion o1, Persion o2) {				
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		//step 2:Create method that print all elements in list
		printAll(people);
		
		//step 3: Create a method that prints all peoples that  have last name begining with c
		//printLastNameBeginigWithE(people);
		printConditionally(people,new Condition(){

			@Override
			public boolean test(Persion p) {
				return p.getLastName().startsWith("E");
			}
			
		});
		
	}

/*	private static void printLastNameBeginigWithE(List<Persion> people) {
		System.out.println("------------------------");
		for(Persion p : people){
			if(p.getLastName().startsWith("E")){
				System.out.println(p);
			}
		}
		
	}*/

	private static void printConditionally(List<Persion> people,Condition condition) {
		System.out.println("------------------------");
		for(Persion p : people){
			/*if(p.getLastName().startsWith("E")){
				System.out.println(p);
			}*/
			if(condition.test(p)){
				System.out.println(p);
			}
		}
		
	}
	
	private static void printAll(List<Persion> people) {
		for(Persion p : people){
			System.out.println(p);
		}
		
	}


}

interface Condition{
	boolean test(Persion p);
}
