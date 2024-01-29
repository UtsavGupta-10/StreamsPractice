package practiceStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicates {
    public static void main(String[] args) {
       

        Stream<Integer> Stream = java.util.stream.Stream.of(1, 2, 3, 3 ,3 ,5 ,4 ,7 , 7, 7);

        
        Set<Integer> uniqueElements = Stream.distinct().collect(Collectors.toSet());
     
        
        uniqueElements.forEach(System.out::println);
    }
}
