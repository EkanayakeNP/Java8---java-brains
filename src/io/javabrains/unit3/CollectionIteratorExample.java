package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.unit2.Persion;

public class CollectionIteratorExample {

	public static void main(String[] args) {
		List<Persion> people = Arrays.asList(
				new Persion("Nishantha","Ekanayake",31),
				new Persion("kamal","santha",30),
				new Persion("amila","Eumara",29)
				);

		System.out.println("Using for loop");
		for(int i=0;i<people.size();i++){
			System.out.println(people.get(1));
		}
		
		System.out.println("\n");
		System.out.println("Using for each loop");
		for(Persion p :people){
			System.out.println(p);
		}
		
		System.out.println("\n");
		System.out.println("Using lambda for each loop");
		//people.forEach(p->System.out.println(p));
		people.forEach(System.out::println);
	}

}
