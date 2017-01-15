import java.util.HashMap;
import java.util.Map;

/**
 * Created by Akash on 1/14/2017.
 */
public class TwoSum {

    int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[1] = i;
                ans[0] = map.get(target - nums[i]);
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String args[]){
        int a[] = {1,2,4,4};

        TwoSum obj = new TwoSum();
        int ans[] = new int[2];
        ans = obj.twoSum(a, 8);
        for(int i: ans){
        System.out.print(i);
        }
    }
}
