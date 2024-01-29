package practiceStream;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(169, 45, 183, 12, 137, 102, 196, 69, 911);

         numbers.stream()
                .filter(i -> i<100)
                .forEach(System.out::println);

    }
}