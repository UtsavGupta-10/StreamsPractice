package practiceStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
    	List<String> words = Arrays.asList("a", "b", "o", "g", "t", "d", "g", "j");
    	
        List<Integer> num = Arrays.asList(9,8,7,6,5,4,3,2,1);

        // natural order for sorting numbers-ascending order, strings-lexicographical order.
        words.stream()
                .sorted()
                .forEach(System.out::print);
        System.out.println();
        
        num.stream()
                .sorted()
                .forEach(System.out::print);
        System.out.println();
        //Comparator- a concept of collection framework
        num.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::print);
    }
}
