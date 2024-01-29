package practiceStream;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .min(Integer::compareTo)
                .ifPresent(min -> System.out.println("Min: " + min));

        numbers.stream()
                .max(Integer::compareTo)
                .ifPresent(max -> System.out.println("Max: " + max));
    }
}
