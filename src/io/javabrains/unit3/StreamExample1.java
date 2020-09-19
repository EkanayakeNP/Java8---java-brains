package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.unit2.Persion;

/**
 * @author hp
 *
 */
public class StreamExample1 {

	public static void main(String[] args) {
		List<Persion> people = Arrays.asList(
				new Persion("Nishantha","Ekanayake",31),
				new Persion("kamal","santha",30),
				new Persion("amila","Eumara",29)
				);
		/*people.stream()
		.filter(p->p.getLastName().startsWith("E"))
		.forEach(p->System.out.println(p.getLastName()));
	*/	
		
		//long count = people.stream()
		long count = people.parallelStream() //can do things in paralle
		.filter(p->p.getLastName().startsWith("E"))
		.count();
		System.out.println(count);
	}

}
