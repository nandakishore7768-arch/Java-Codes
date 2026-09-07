import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Main3{
    public static void main(String[] args){
        Map <Integer, Integer> nums = new HashMap<Integer, Integer>();

        // key cannot be repeated
        //keys are actually a set and values are a list
        nums.put(62, 31);
        nums.put(34, 17);
        nums.put(92, 46);

        System.out.println(nums);
        System.out.println(nums.get(34));

        for(Integer name: nums.keySet()){
            System.out.println(name + " : " + nums.get(name));
        }
    }
}