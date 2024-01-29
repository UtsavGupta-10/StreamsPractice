package practiceStream;

import java.util.*; 

public class GFG { 

	public static void main(String[] args) 
	{ 
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		al.add(2); 
		al.add(6); 
		al.add(9); 
		al.add(4); 
		al.add(20); 

		System.out.println("Printing the collection : "+ al); 

		System.out.println(); 

		al.stream() 
				.filter(i -> i % 2 == 0) 
				
		 .forEach(i->System.out.println(i));
	} 
}
