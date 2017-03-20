/**
 * Created by Akash on 3/4/2017.
 */
public class ArrayDPPredictTheWinner {

    // simple recursion
    public static boolean PredictTheWinner(int[] nums) {
        return helper(nums, 0, nums.length-1)>= 0;
    }

    private static int helper(int[] nums, int i, int j){
        return i==j ? nums[i] : Math.max((nums[i] - helper(nums, i+1, j)), (nums[j] - helper(nums, i, j-1)));
    }


    // using memoization
    private static boolean predictMemo(int[] nums){
        int n = nums.length;
        int dp[][] = new int[n][n];
        for(int i = 0; i < n; i++) dp[i][i] = nums[i];

        for(int len = 1; len < n; len++){
            for(int i = 0; i < n-len; i++){
                int j = i + len;
                dp[i][j] = Math.max((nums[i]-dp[i+1][j]), (nums[j]-dp[i][j-1]));
            }
        }
        return dp[0][n-1]>=0;
    }



    public static void main(String[] args){
        int[] a = {1,2,3,4};
        System.out.println(predictMemo(a));
    }
}
