import java.util.HashMap;
import java.util.Map;

/**
 * Created by Akash on 1/15/2017.
 */
public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if((i-map.get(nums[i]) <= k)) {
                    return true;
                }
            }

                map.put(nums[i], i);

        }
        return false;
    }

    public static void main(String args[]){
        int a[]= {1,0,1,1};
        ContainsDuplicate2 obj = new ContainsDuplicate2();
        System.out.print(obj.containsNearbyDuplicate(a, 1));
    }
}
