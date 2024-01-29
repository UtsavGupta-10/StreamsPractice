package practiceStream;

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        long count = numbers.stream()    //can't use int as count returns long, int gives comp. error
                .count();
        System.out.println("Count: " + count);
    }
}
