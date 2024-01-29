package practiceStream;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("Good ","day ","day ","bye ","bye ");
        
        words.stream()
        .distinct()
        .forEach(System.out::print);
        
    }
}
