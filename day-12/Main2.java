import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Main2{
    public static void main(String [] args){
        // list also supports duplicate values
        // set is not sorted in nature - always - it is sorted based on the hash value
        // for sorted set - use tree set
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(6);
        for(int x: nums){
            System.out.println(x);
        }

        Set<Integer> num1 = new TreeSet<Integer>();
        num1.add(63);
        num1.add(43);
        num1.add(24);
        num1.add(89);

        System.out.println(num1);

        Iterator <Integer> values = num1.iterator();

        while(values.hasNext())
            System.out.println(values.next());

        // System.out.println(nums.indexOf(6));
        // System.out.println(nums.get(2)); 
        
    }
}