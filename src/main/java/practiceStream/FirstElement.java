package practiceStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 7, 3);
        
        Optional<Integer> firstElement = numbers.stream().findFirst();

        firstElement.ifPresent(i -> System.out.println("First element: " + i));

    }
}
