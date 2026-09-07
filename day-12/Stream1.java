import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream1{
    public static void main(String[] args){
        List<Integer> nums=  Arrays.asList(4,5,7,2);

        Consumer<Integer> con = (Integer n) -> System.out.println(n);
        // int sum = 0;
        // for(int n: nums){
        //     if(n % 2 == 0){
        //         sum = sum + 2 * n;
        //     }
        // }

        // System.out.println(nums);
        // System.out.println(sum);

        nums.forEach(con);
    }
}