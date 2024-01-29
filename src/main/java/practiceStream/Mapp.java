package practiceStream;

import java.util.Arrays;
import java.util.List;

public class Mapp {
    public static void main(String[] args) {
//       List<String> words = Arrays.asList("apple", "banana", "orange", "grape");
        
       List<Integer>numbers=Arrays.asList(1, 2, 3, 4, 5);
        
//        words.stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
        
       int average= numbers.stream()
                .map(i-> i*2)
                
                .reduce(0, Integer::sum);
        System.out.println("average: " + average/numbers.size());
        
        
    }
}
