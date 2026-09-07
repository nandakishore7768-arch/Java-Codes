import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main4{
    public static void main(String[] args){
        Comparator<Integer> comp = new Comparator<>(){
            public int compare(Integer x, Integer y){
                if(x % 10 > y % 10){
                    return 1;
                }
                else if(x % 10 < y % 10){
                    return -1;
                }
                else if(x % 10 > y % 10){
                    if(x/ 10 > 0 && y / 10 > 0){
                        return compare(x/ 10, y/ 10);
                    }
                    else if(x/ 10 > 0){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                return 0;
            }
        };
        List<Integer> nums=  new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(91);
        nums.add(75);
        nums.add(29);

        Collections.sort(nums, comp);
        System.out.println(nums);
    }
}

// if we want to compare them,we use the comparator, else 
// we can also give this power to a class by making this comparable
