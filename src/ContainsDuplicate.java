import java.util.HashSet;
import java.util.Set;

/**
 * Created by Akash on 1/15/2017.
 */
public class ContainsDuplicate {

    boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for(int m : nums){
            if(set.contains(m)) {
                return true;
            }
            else{
                set.add(m);
            }
        }
        return false;

    }

    public static void main(String args[]){
        ContainsDuplicate obj = new ContainsDuplicate();
        int nums[] = {1,2,4,4};
        System.out.print(obj.containsDuplicate(nums));
    }
}
