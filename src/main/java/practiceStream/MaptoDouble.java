package practiceStream;

import java.util.Arrays;
import java.util.List;

public class MaptoDouble {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        numbers.stream()
                .mapToDouble(i -> i)
                .forEach(System.out::println);
    }
}
