package practiceStream;

import java.io.*; 
import java.util.*; 
import java.util.stream.*; 

class Test { 
       public static void main(String[] args) { 

	ArrayList<Integer> marks = new ArrayList<Integer>(); 

		marks.add(30); 
		marks.add(78); 
		marks.add(26); 
		marks.add(96); 
		marks.add(79); 

		System.out.println( 
			"Marks of students before grace : " + marks); 

		marks.stream() 
				.map(i -> i + 6) 
				.forEach(System.out::println);
              
	} 
}
