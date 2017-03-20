import java.util.Arrays;

/**
 * Created by Akash on 3/3/2017.
 */
public class HouseRobber {

    private static int robber(int[] nums){
        //return rec(nums, 0);
        //return recWithMemo(nums);
        return dp(nums);
    }

    private static int dp(int[] nums){
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int memo[] = new int[nums.length];
        memo[0] = nums[0];
        memo[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++){
            int op1 = nums[i] + memo[i-2];
            int op2 = memo[i-1];
            memo[i] = Math.max(op1,op2);
        }
        return memo[nums.length-1];
    }

    private static int recWithMemo(int[] nums){
        int[] cache = new int[nums.length];
        Arrays.fill(cache, -1);
        return dfsCache(nums, 0, cache);

    }

    private static int dfsCache(int[] nums, int pos, int[] cache){
        if(pos >= nums.length) return 0;
        if(cache[pos] != -1) return cache[pos];

        int op1 = nums[pos] + dfsCache(nums, pos+2, cache);
        int op2 = dfsCache(nums, pos+1, cache);
        cache[pos] = Math.max(op1, op2);
        return cache[pos];
    }

    private  static int rec(int[] nums, int pos){
        if(pos >= nums.length){
            return 0;
        }
        int op1 = nums[pos] + rec(nums, pos+2);
        int op2 = rec(nums, pos+1);
        return Math.max(op1, op2);
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,2,4};
        System.out.print(robber(nums));
    }
}
