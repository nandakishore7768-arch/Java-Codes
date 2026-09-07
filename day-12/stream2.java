import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        Stream <Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 3);
        int result = s3.reduce(0, (c, e) -> c + e);
        System.out.println(result);
        // s3.forEach(n -> System.out.println(n));
    }
}

// stream can be used only once

// we can also apply the filter, map and reduce directly by chaining them


